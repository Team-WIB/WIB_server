package WIB.webinterbook.domain.question.presentation.dto.res;

import WIB.webinterbook.domain.question.Question;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class GetQuestionsResDto {

    List<Question> questions;
}
