package WIB.webinterbook.domain.question;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "questions")
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
public class Question extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;
    @Enumerated(EnumType.STRING)
    private QuestionTag tag;
    private String answer;

    public Question update(String question, String answers, String tag) {
        this.question = question;
        this.answer = answers;
        this.tag = new QuestionTagUtil().stringToQuestionTag(tag);
        return this;
    }
}
