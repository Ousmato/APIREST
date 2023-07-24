package quizAPI.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.aspectj.weaver.patterns.TypePatternQuestions;

@Entity
@Data
public class Reponse {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String text;

    ManyToOne
    @JoinColumn(name = "quetions_id", nullable = false)
    private Questions questions;

}
