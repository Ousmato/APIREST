package quizAPI.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Reponse {
    @Id
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String text;

}
