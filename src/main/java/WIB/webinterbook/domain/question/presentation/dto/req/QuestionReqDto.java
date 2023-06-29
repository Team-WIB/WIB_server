package WIB.webinterbook.domain.question.presentation.dto.req;

import WIB.webinterbook.domain.question.Question;
import WIB.webinterbook.domain.question.QuestionTag;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionReqDto {

    @NotBlank(message = "질문은 필수 입력 사항입니다.")
    String question;
    String answer;
    String tag;

    public Question toEntity(QuestionTag tag) {
        return Question.builder()
            .question(question)
            .answer(answer)
            .tag(tag)
            .build();
    }
}