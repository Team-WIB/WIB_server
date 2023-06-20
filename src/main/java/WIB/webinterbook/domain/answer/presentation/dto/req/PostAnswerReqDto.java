package WIB.webinterbook.domain.answer.presentation.dto.req;

import WIB.webinterbook.domain.answer.Answer;
import WIB.webinterbook.domain.question.Question;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostAnswerReqDto {

    private String content;

    public Answer toEntity(Question question) {
        return Answer.builder()
            .content(content)
            .question(question)
            .build();
    }
}
