
package quizAPI.demo.Repository;
import quizAPI.demo.Entity.Questions;

import java.util.List;

public interface Questions_repository extends CrudRepository<Questions, Integer> {
    List<Questions> findAll();
}
