package WIB.webinterbook.domain.question.exception;

import WIB.webinterbook.global.exception.BasicException;
import WIB.webinterbook.global.exception.ErrorCode;

public class NotQuestionTagException extends BasicException {
    public NotQuestionTagException() {
        super(ErrorCode.NOT_QUESTION_TAG);
    }
}
