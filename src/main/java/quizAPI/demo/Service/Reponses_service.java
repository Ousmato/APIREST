
package quizAPI.demo.Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Reponses_service {

    private Repository_reponse repositoryReponse;
    //constructeur avec param
    public Reponse_service(Repository_reponse repositoryReponse){
        this.repositoryReponse = repositoryReponse;
    }

    public void addReponse(Reponse reponse){
        repositoryReponse.save(reponse);
    }

    public List<Reponse> readReponse(){
        return repositoryReponse.findAll();
    }

    public String deleteReponse(int id){
        repositoryReponse.findById(id);
        return "delete succesful";
    }

    public Reponse updateReponse(Reponse reponse){
        return repositoryReponse.save(reponse);
    }
}

