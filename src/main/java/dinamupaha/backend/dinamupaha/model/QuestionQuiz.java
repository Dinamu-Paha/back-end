package dinamupaha.backend.dinamupaha.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class QuestionQuiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int questionQuizId;
    private int questionId;
    private String quizName;

}
