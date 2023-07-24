
package quizAPI.demo.Service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Quetions_service {
    private Repository_question repositoryQuestion;
    //constructeur
    public Questions_service(Repository_question repositoryQuestion){
        this.repositoryQuestion = repositoryQuestion;
    }

    public void createQuestion(Questions questions){
        repositoryQuestion.save(questions);
    }

    public List<Questions> readQuestion(){
        return repositoryQuestion.findAll();

    }

    public void deleteQuestion(int id){
        repositoryQuestion.deleteById(id);
    }

    public Questions updateQuestion(Questions questions){
        return repositoryQuestion.save(questions);
    }
}
