package WIB.webinterbook.domain.answer;

import WIB.webinterbook.domain.question.BaseTimeEntity;
import WIB.webinterbook.domain.question.Question;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Answer extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String content;
    @ManyToOne
    @JsonIgnore
    private Question question;

    @Builder
    public Answer(String content, Question question) {
        this.content = content;
        this.question = question;
    }
}
