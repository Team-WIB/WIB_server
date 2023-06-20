package WIB.webinterbook.domain.answer.repository;

import WIB.webinterbook.domain.answer.Answer;
import WIB.webinterbook.domain.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

    public List<Answer> findAllByQuestion(Question question);
}
