package WIB.webinterbook.domain.answer.presentation;

import WIB.webinterbook.domain.answer.presentation.dto.req.PostAnswerReqDto;
import WIB.webinterbook.domain.answer.presentation.dto.res.GetAnswersResDto;
import WIB.webinterbook.domain.answer.service.GetAnswersService;
import WIB.webinterbook.domain.answer.service.PostAnswerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/{id}/answers")
@RequiredArgsConstructor
@Slf4j
public class AnswerController {

    private final GetAnswersService getAnswersService;
    private final PostAnswerService postAnswerService;

    @GetMapping
    public ResponseEntity<GetAnswersResDto> getAnswers(@PathVariable Long id) {
        return ResponseEntity.ok(getAnswersService.execute(id));
    }

    @PostMapping
    public ResponseEntity<Void> postAnswer(@PathVariable Long id, @RequestBody PostAnswerReqDto reqDto) {
        log.info("AnswerController.postAnswer");
        log.info("id={}", id);
        postAnswerService.execute(id, reqDto);
        return ResponseEntity.ok().build();
    }
}
