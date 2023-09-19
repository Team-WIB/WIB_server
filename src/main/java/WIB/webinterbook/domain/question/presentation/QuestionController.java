package WIB.webinterbook.domain.question.presentation;

import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.QuestionTag;
import WIB.webinterbook.domain.question.presentation.dto.req.QuestionReqDto;
import WIB.webinterbook.domain.question.presentation.dto.req.UpdateQuestionReqDto;
import WIB.webinterbook.domain.question.presentation.dto.res.GetQuestionResDto;
import WIB.webinterbook.domain.question.presentation.dto.res.GetQuestionsResDto;
import WIB.webinterbook.domain.question.service.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/questions")
@Slf4j
//@CrossOrigin(origins = "http://ec2-3-39-199-70.ap-northeast-2.compute.amazonaws.com:8080")
public class QuestionController {

    private final CreateQuestionService createQuestionService;
    private final GetQuestionsService getQuestionsService;
    private final UpdateQuestionService updateQuestionService;
    private final GetQuestionService getQuestionService;
    private final MockInterviewService mockInterviewService;

    @PostMapping
    public ResponseEntity<Void> createQuestion(@RequestBody @Valid QuestionReqDto reqDto) {
        createQuestionService.execute(reqDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<GetQuestionsResDto> getQuestions() {
        return ResponseEntity.ok(getQuestionsService.execute());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetQuestionResDto> getQuestion(@PathVariable Long id) {
        return ResponseEntity.ok(getQuestionService.execute(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Question> updateQuestion(@PathVariable Long id, @RequestBody UpdateQuestionReqDto reqDto) {
        updateQuestionService.execute(id, reqDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/interview/{tag}/{amount}")
    public ResponseEntity<List<Question>> mockInterview(
        @PathVariable("tag") QuestionTag tag,
        @PathVariable("amount") int amount) {
        return ResponseEntity.ok(mockInterviewService.execute(tag, amount));
    }
}
