package quizAPI.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import quizAPI.demo.Entity.Quiz;

import java.util.List;

public interface Quiz_repository extends CrudRepository<Quiz, Long> {
    Quiz creerQuiz(Quiz quiz);
    List<Quiz> LireQuiz();
    Quiz getUser(Long id, Quiz quiz);
    Quiz modifierQuiz(Long id, Quiz quiz);
    String supprimerQuiz(Long id);

}
