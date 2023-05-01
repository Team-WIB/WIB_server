package WIB.webinterbook.domain.question.exception;

import WIB.webinterbook.global.exception.BasicException;
import WIB.webinterbook.global.exception.ErrorCode;

public class WrongQuestionTagException extends BasicException {
    public WrongQuestionTagException() {
        super(ErrorCode.WRONG_QUESTION_TAG);
    }
}
