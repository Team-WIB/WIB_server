package WIB.webinterbook.domain.question;

import WIB.webinterbook.domain.answer.Answer;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.TimeZone;

@Entity
@Table(name = "questions")
@NoArgsConstructor
@Builder
@AllArgsConstructor
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
