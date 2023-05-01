package WIB.webinterbook.domain.question.presentation;

import WIB.webinterbook.domain.question.presentation.dto.req.QuestionReqDto;
import WIB.webinterbook.domain.question.service.CreateQuestionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/question")
@Slf4j
public class QuestionController {

    private final CreateQuestionService createQuestionService;

    @PostMapping("/")
    public ResponseEntity<Void> createQuestion(@RequestBody QuestionReqDto reqDto) {
        createQuestionService.execute(reqDto);
        return ResponseEntity.ok().build();
    }
}
