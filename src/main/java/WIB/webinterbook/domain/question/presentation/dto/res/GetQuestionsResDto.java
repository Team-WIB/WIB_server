package WIB.webinterbook.domain.question.presentation.dto.res;

import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.QuestionTag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class GetQuestionsResDto {

    private final List<Question> questions;
}