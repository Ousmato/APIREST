package quizAPI.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    @Column(nullable = false)
    @JsonIgnoreProperties("quiz")
    private List<Questions> questions;

    @ManyToOne
    @JoinColumn(name ="user_id", nullable = false)
    private User user;

}
