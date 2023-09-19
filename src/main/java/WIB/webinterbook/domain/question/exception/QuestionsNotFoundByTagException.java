package WIB.webinterbook.domain.question.exception;

import WIB.webinterbook.global.exception.BasicException;
import WIB.webinterbook.global.exception.ErrorCode;

public class QuestionsNotFoundByTagException extends BasicException {

    public QuestionsNotFoundByTagException() {
        super(ErrorCode.QUESTIONS_NOT_FOUND_BY_TAG);
    }
}
