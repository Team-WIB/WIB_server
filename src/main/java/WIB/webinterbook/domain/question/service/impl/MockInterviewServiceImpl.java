package WIB.webinterbook.domain.question.service.impl;

import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.QuestionTag;
import WIB.webinterbook.domain.question.QuestionTagUtil;
import WIB.webinterbook.domain.question.exception.QuestionsNotFoundByTagException;
import WIB.webinterbook.domain.question.repository.QuestionRepository;
import WIB.webinterbook.domain.question.service.MockInterviewService;
import WIB.webinterbook.global.exception.ErrorResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.shuffle;

@Service
@RequiredArgsConstructor
public class MockInterviewServiceImpl implements MockInterviewService {

    private final QuestionRepository questionRepository;

    @Override
    public List<Question> execute(QuestionTag tag, int amount) {
        List<Question> questions = questionRepository.findAllByTag(tag);
        if (questions.isEmpty()) throw new QuestionsNotFoundByTagException();

        shuffle(questions);
        return questions.stream()
//            .limit(questions.size())
            .limit(amount)
            .collect(Collectors.toList());
    }
}
