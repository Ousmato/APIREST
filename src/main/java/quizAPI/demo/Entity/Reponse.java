package quizAPI.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Reponse {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String text;

}
