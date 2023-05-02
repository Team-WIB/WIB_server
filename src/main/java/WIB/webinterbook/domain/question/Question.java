package WIB.webinterbook.domain.question;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.TimeZone;

@Entity
@Table(name = "questions")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Question extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String content;
    @Enumerated(EnumType.STRING)
    private QuestionTag tag;

}
