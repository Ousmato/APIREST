package quizAPI.demo.Controleur;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import quizAPI.demo.Entity.Reponse;

import java.util.List;

@RestController
@RequestMapping("/reponse")
public class Reponse_controller {
    @Autowired
    private Reponse_service reponseService;

    @PostMapping("/add")
    public String addReponse(@RequestBody Reponse reponse){
        reponseService.addReponse(reponse);
        return "add response successful";
    }

    @GetMapping("/read")
    public List<Reponse> readReponse(){
        return reponseService.readReponse();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteReponse(@PathVariable int id){
        reponseService.deleteReponse(id);
        return new ResponseEntity<>("delete successful", HttpStatus.OK);
    }

    @PutMapping("updateReponse")
    public Reponse updateReponse(@RequestBody Reponse reponse){
        return reponseService.updateReponse(reponse);
    }
}

