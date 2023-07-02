package WIB.webinterbook.domain.question.service.impl;

import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.QuestionTag;
import WIB.webinterbook.domain.question.QuestionTagUtil;
import WIB.webinterbook.domain.question.repository.QuestionRepository;
import WIB.webinterbook.domain.question.service.MockInterviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Collections.shuffle;

@Service
@RequiredArgsConstructor
public class MockInterviewServiceImpl implements MockInterviewService {

    private final QuestionRepository questionRepository;
    private final QuestionTagUtil questionTagUtil;

    @Override
    public List<Question> execute(String tag, int amount) {
        QuestionTag questionTag = questionTagUtil.checkIsQuestionTag(tag);
        List<Question> tags = questionRepository.findAllByTag(questionTag);
        shuffle(tags);
        List<Question> result;
        if (tag.length() < amount) {
            result = tags.subList(0, tag.length());
        } else {
            result = tags.subList(0, amount);
        }
        return result;
    }
}
