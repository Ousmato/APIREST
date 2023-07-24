package quizAPI.demo.Controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quetions")
public class Quetions_controller {


    @Autowired
    private Questions_service questionsService;
    @PostMapping("/creat")
    public String createQuestion(@RequestBody Questions questions){
        questionsService.createQuestion(questions);
        return "création avec succès";
    }

    @GetMapping("/read")
    public List<Questions> readQuestion(){
        return questionsService.readQuestion();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteQuestion(@PathVariable int id){
        questionsService.deleteQuestion(id);
        return "delete success";
    }

    @PutMapping("/putQuestion")
    public Questions updateQuestion(@RequestBody Questions questions){
        return questionsService.updateQuestion(questions);
    }
}

