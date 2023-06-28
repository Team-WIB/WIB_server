package WIB.webinterbook.domain.question.presentation.dto.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateQuestionReqDto {

    private String question;
    private String answer;
    private String tag;
}
