package WIB.webinterbook.domain.question.service;

import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.QuestionTag;

import java.util.List;

public interface MockInterviewService {

    List<Question> execute(String tag, int amount);
}
