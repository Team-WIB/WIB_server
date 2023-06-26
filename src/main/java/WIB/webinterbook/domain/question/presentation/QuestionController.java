package WIB.webinterbook.domain.question.presentation;

import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.presentation.dto.req.QuestionReqDto;
import WIB.webinterbook.domain.question.presentation.dto.req.UpdateQuestionReqDto;
import WIB.webinterbook.domain.question.presentation.dto.res.GetQuestionsResDto;
import WIB.webinterbook.domain.question.service.CreateQuestionService;
import WIB.webinterbook.domain.question.service.GetQuestionsService;
import WIB.webinterbook.domain.question.service.UpdateQuestionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/questions")
@Slf4j
public class QuestionController {

    private final CreateQuestionService createQuestionService;
    private final GetQuestionsService getQuestionsService;
    private final UpdateQuestionService updateQuestionService;

    @PostMapping
    public ResponseEntity<Void> createQuestion(@RequestBody @Valid QuestionReqDto reqDto) {
        createQuestionService.execute(reqDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<GetQuestionsResDto> getQuestions() {
        GetQuestionsResDto result = getQuestionsService.execute();
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Question> updateQuestion(Long id, UpdateQuestionReqDto reqDto) {
        updateQuestionService.execute(id, reqDto);
        return ResponseEntity.ok().build();
    }
}
