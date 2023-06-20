package WIB.webinterbook.domain.answer.presentation.dto.res;

import WIB.webinterbook.domain.answer.Answer;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class GetAnswersResDto {

    private List<Answer> answers;
}
