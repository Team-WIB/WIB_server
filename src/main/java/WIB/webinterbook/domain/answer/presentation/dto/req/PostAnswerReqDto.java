package WIB.webinterbook.domain.answer.presentation.dto.req;

import WIB.webinterbook.domain.answer.Answer;
import WIB.webinterbook.domain.question.Question;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostAnswerReqDto {

    private String content;

    public Answer toEntity(Question question) {
        return Answer.builder()
            .content(content)
            .question(question)
            .build();
    }
}
