package quizAPI.demo.Controleur;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quizAPI.demo.Entity.Quiz;
import quizAPI.demo.Service.Quiz_service;

@Data
@RestController
@RequestMapping("/quiz")
public class Quiz_controller {
    @Autowired
    private final Quiz_service quizService;
    @PostMapping("/create")
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.creerQuiz(quiz);
    }

    // LA METHODE READ
    @GetMapping("/read")
    public Iterable<Quiz> read(){
        return quizService.LireQuiz();
    }
    @GetMapping("/read/{id}")
    public Quiz read(@PathVariable Long id, @RequestBody Quiz quiz){
        return quizService.getUser(id, quiz);
    }

    // LA METHODE UPDATE
    @PutMapping("/update/{id}")
    public Quiz update(@PathVariable Long id, @RequestBody Quiz quiz){
        return quizService.modifierQuiz(id, quiz);
    }
    // LA METHODE DELETE
    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        return quizService.supprimerQuiz(id);
    }

}
