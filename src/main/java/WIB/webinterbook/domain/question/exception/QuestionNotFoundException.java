package WIB.webinterbook.domain.question.exception;

import WIB.webinterbook.global.exception.BasicException;
import WIB.webinterbook.global.exception.ErrorCode;

public class QuestionNotFoundException extends BasicException {
    public QuestionNotFoundException() {
        super(ErrorCode.QUESTION_NOT_FOUND);
    }
}
