package WIB.webinterbook.global.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

@Getter
@Builder
@RequiredArgsConstructor
public class ErrorResponse {
    private final String name;
    private final int code;
    private final String message;

    public ErrorResponse(ErrorCode errorCode) {
        this.name = errorCode.name();
        this.message = errorCode.getMessage();
        this.code = errorCode.getCode();
    }

    public static ResponseEntity<ErrorResponse> sendError(BasicException e) {
        return ResponseEntity
            .status(e.getErrorCode().getCode())
            .body(ErrorResponse.builder()
                .name(e.getErrorCode().name())
                .code(e.getErrorCode().getCode())
                .message(e.getErrorCode().getMessage())
                .build());
    }
}