package WIB.webinterbook.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    NOT_QUESTION_TAG("태그는 BE 혹은 FE 여야 합니다.", 400),
    QUESTION_NOT_FOUND("질문을 찾을 수 없습니다.", 400),
    QUESTIONS_NOT_FOUND_BY_TAG("해당 태그의 질문이 존재하지 않습니다.", 400);

    private String message;
    private int code;
}