package quizAPI.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import quizAPI.demo.Entity.User;

import java.util.List;

public interface User_repository  extends CrudRepository <User, Long> {
    User creer(User user);
    List <User> Lire();
    User getUser(Long id, User user);

    User modifier(Long id, User user);
    String supprimer(Long id);
}
