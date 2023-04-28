package WIB.webinterbook.question;

import jakarta.persistence.*;

@Entity
@Table
public class QuestionTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String content;
}
