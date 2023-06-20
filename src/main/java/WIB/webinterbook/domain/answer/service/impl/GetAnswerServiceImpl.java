package WIB.webinterbook.domain.answer.service.impl;

import WIB.webinterbook.domain.answer.Answer;
import WIB.webinterbook.domain.answer.presentation.dto.res.GetAnswersResDto;
import WIB.webinterbook.domain.answer.repository.AnswerRepository;
import WIB.webinterbook.domain.answer.service.GetAnswersService;
import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAnswerServiceImpl implements GetAnswersService {

    private final AnswerRepository answerRepository;
    private final QuestionRepository questionRepository;

    @Override
    public GetAnswersResDto execute(Long id) {
        Question question = questionRepository.findById(id).orElseThrow();
        List<Answer> answers = answerRepository.findAllByQuestion(question);
        return new GetAnswersResDto(answers);
    }
}
