package dinamupaha.backend.dinamupaha.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UserQuiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userQuizId;
    private int userId;
    private String quizName;
    private int marks;
}
