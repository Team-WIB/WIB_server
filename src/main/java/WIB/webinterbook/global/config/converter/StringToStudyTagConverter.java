package WIB.webinterbook.global.config.converter;

import WIB.webinterbook.domain.question.QuestionTag;
import WIB.webinterbook.domain.question.exception.NotQuestionTagException;
import org.springframework.core.convert.converter.Converter;

public class StringToStudyTagConverter implements Converter<String, QuestionTag> {
    @Override
    public QuestionTag convert(String source) {
        try {
            return QuestionTag.valueOf(source.toUpperCase());

        } catch (Exception e) {
            throw new NotQuestionTagException();
        }
    }
}
