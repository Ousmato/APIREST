package quizAPI.demo.Service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import quizAPI.demo.Entity.User;
import quizAPI.demo.Repository.User_repository;

import java.util.List;

@Data
public class User_service {
    @Autowired
    private final User_repository userRepository;

    public User creer(User user) {
        return userRepository.save(user);
    }

    public List<User> Lire() {
        return userRepository.findAll();
    }


    public User getUser(Long id, User user){
        return userRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Utilisateur non trouvé !"));

    }



    public User modifier(Long id, User user) {


        return userRepository.findById(id).map(u ->{

            u.setNom(user.getNom());
            u.setPrenom(user.getPrenom());
            u.setAge(user.getAge());
            u.setTelephone(user.getTelephone());
            u.setEmail(user.getEmail());
            u.setMotDePass(user.getMotDePass());
            return userRepository.save(u);
        }).orElseThrow(()-> new RuntimeException("Utilisateur non trouvé !"));
    }

    public String supprimer(Long id) {
        userRepository.deleteById(id);
        return "Utilisateur supprimer avec succès !";
    }


}
