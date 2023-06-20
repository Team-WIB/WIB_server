package WIB.webinterbook.domain.answer;

import WIB.webinterbook.domain.question.Question;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    @ManyToOne
    private Question question;

    @Builder
    public Answer(String content, Question question) {
        this.content = content;
        this.question = question;
    }
}
