package quizAPI.demo.Service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quizAPI.demo.Entity.Quiz;
import quizAPI.demo.Repository.Quiz_repository;

@Data
@Service

public class Quiz_service {

    @Autowired
    private final Quiz_repository quizRepository;

    public Quiz creerQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }


    public Iterable<Quiz> LireQuiz() {
        return quizRepository.findAll();
    }

    public Quiz getUser(Long id, Quiz quiz){
        return quizRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Quiz non trouvé !"));

    }


    public Quiz modifierQuiz(Long id, Quiz quiz) {
        return quizRepository.findById(id).map(q ->{

            q.setTitre(quiz.getTitre());
            q.setUser(quiz.getUser());

            return quizRepository.save(q);
        }).orElseThrow(()-> new RuntimeException("Quiz non trouvé !"));
    }

    public String supprimerQuiz(Long id) {
        quizRepository.deleteById(id);
        return "Quiz supprimer avec succès !";
    }
}
