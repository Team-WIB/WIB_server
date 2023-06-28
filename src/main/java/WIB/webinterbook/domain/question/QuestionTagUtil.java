package WIB.webinterbook.domain.question;

import WIB.webinterbook.domain.question.exception.WrongQuestionTagException;
import org.springframework.stereotype.Component;

@Component
public class QuestionTagUtil {

    public QuestionTag checkIsQuestionTag(String tag) {
        if (tag.equals("BE")) return QuestionTag.BE;
        else if (tag.equals("FE")) return QuestionTag.FE;
        else throw new WrongQuestionTagException();

    }
}
