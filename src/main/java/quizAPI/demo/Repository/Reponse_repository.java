
package quizAPI.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import quizAPI.demo.Entity.Reponse;

import java.util.List;

public interface Reponse_repository extends CrudRepository<Reponse, Integer> {
    List<Reponse> findAll();
}
