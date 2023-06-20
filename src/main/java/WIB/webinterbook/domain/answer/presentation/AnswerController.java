package WIB.webinterbook.domain.answer.presentation;

import WIB.webinterbook.domain.answer.Answer;
import WIB.webinterbook.domain.answer.presentation.dto.req.PostAnswerReqDto;
import WIB.webinterbook.domain.answer.presentation.dto.res.GetAnswersResDto;
import WIB.webinterbook.domain.answer.repository.AnswerRepository;
import WIB.webinterbook.domain.answer.service.GetAnswersService;
import WIB.webinterbook.domain.answer.service.PostAnswerService;
import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/{id}/answers")
@RequiredArgsConstructor
public class AnswerController {

    private final GetAnswersService getAnswersService;
    private final PostAnswerService postAnswerService;

    @GetMapping
    public ResponseEntity<GetAnswersResDto> getAnswers(@PathVariable Long id) {
        return ResponseEntity.ok(getAnswersService.execute(id));
    }

    @PostMapping
    public ResponseEntity<Void> postAnswer(@PathVariable Long id, @RequestBody PostAnswerReqDto reqDto) {
        postAnswerService.execute(id, reqDto);
        return ResponseEntity.ok().build();
    }
}
