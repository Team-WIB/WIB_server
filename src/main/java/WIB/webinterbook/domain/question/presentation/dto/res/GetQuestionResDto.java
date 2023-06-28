package WIB.webinterbook.domain.question.presentation.dto.res;

import WIB.webinterbook.domain.question.Question;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetQuestionResDto {

    private final Question question;
}
