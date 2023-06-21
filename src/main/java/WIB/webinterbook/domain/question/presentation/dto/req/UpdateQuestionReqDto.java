package WIB.webinterbook.domain.question.presentation.dto.req;

import WIB.webinterbook.domain.question.Question;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateQuestionReqDto {

    private String question;
    private String answer;
}
