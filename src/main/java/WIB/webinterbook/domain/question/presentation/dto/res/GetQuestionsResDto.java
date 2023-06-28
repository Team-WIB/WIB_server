package WIB.webinterbook.domain.question.presentation.dto.res;

import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.QuestionTag;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
public class GetQuestionsResDto {

    private List<SimpleQuestionInfo> questions;

    public GetQuestionsResDto(List<Question> datas) {
        datas.forEach(data -> questions.add(new SimpleQuestionInfo(data)));
    }
}

@Getter
class SimpleQuestionInfo {
    private final Long id;
    private final String question;
    private final QuestionTag tag;

    public SimpleQuestionInfo(Question data) {
        this.id = data.getId();
        this.question = data.getQuestion();
        this.tag = data.getTag();
    }
}