package WIB.webinterbook.domain.question;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "questions")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    @Enumerated(EnumType.STRING)
    private QuestionTag tag;
}
