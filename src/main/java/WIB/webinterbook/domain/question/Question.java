package WIB.webinterbook.domain.question;

import WIB.webinterbook.domain.answer.Answer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

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
    private String content;
    @Enumerated(EnumType.STRING)
    private QuestionTag tag;
    @OneToMany(mappedBy = "question")
    private List<Answer> answers;
}
