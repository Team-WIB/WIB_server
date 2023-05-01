package WIB.webinterbook.domain.question.presentation.dto.req;

import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.QuestionTag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionReqDto {

    String content;
    String tag;

   public Question toEntity(QuestionTag tag) {
        return Question.builder()
            .content(content)
            .tag(tag)
            .build();
    }
}