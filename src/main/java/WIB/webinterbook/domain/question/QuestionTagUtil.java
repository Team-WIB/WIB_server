package WIB.webinterbook.domain.question;

import WIB.webinterbook.domain.question.exception.NotQuestionTagException;
import org.springframework.stereotype.Component;

@Component
public class QuestionTagUtil {

    public QuestionTag stringToQuestionTag(String tag) {
        if (tag.equals("BE")) return QuestionTag.BE;
        else if (tag.equals("FE")) return QuestionTag.FE;
        else throw new NotQuestionTagException();
    }
}
