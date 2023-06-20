package WIB.webinterbook.domain.answer.presentation;

import WIB.webinterbook.domain.answer.presentation.dto.res.GetAnswersResDto;
import WIB.webinterbook.domain.answer.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;

@RequestMapping("/{id}/answers")
@RequiredArgsConstructor
public class AnswerController {

    private final AnswerRepository answerRepository;

    @GetMapping
    public ResponseEntity<GetAnswersResDto> getAnswers(@RequestParam Long id) {
        GetAnswersResDto result = new GetAnswersResDto(answerRepository.findAllById(Collections.singleton(id)));
        return ResponseEntity.ok(result);
    }


}
