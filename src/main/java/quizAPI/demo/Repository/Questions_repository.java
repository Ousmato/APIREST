
package quizAPI.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import quizAPI.demo.Entity.Questions;

public interface Questions_repository extends CrudRepository<Questions, Integer> {

}
