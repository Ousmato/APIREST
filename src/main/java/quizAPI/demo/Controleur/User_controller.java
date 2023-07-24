package quizAPI.demo.Controleur;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quizAPI.demo.Entity.User;
import quizAPI.demo.Service.User_service;

import java.util.List;

@Data
@RestController
@RequestMapping("/user")
public class User_controller {
    @Autowired
    private final User_service userService;

    @PostMapping("/create")
    public User create(@RequestBody User user){
        return userService.creer(user);
    }
    // LA METHODE READ
    @GetMapping("/read")
    public List<User> read(){
        return userService.Lire();
    }

    @GetMapping("/read/{id}")
    public User read(@PathVariable Long id, @RequestBody User user){
        return userService.getUser(id, user);
    }

    // LA METHODE UPDATE
    @PutMapping("/update/{id}")
    public User update(@PathVariable Long id, @RequestBody User user){
        return userService.modifier(id, user);
    }
    // LA METHODE DELETE
    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        return userService.supprimer(id);
    }
}
