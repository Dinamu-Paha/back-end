package dinamupaha.backend.dinamupaha.repository;

import dinamupaha.backend.dinamupaha.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
    @Query("from Question q where q.subjectId = :subjectId and q.subtopicId = :subtopicId")
    List<Question> getQuestion(int subjectId, int subtopicId);
    @Query
            ("select distinct(q.quizName) from Question  q where q.quizName is not null")
    List<String> getQuizzes();
    @Query
            ("from Question q where q.quizName = :quizName")
    List<Question> getQuestionsOfQuiz(String quizName);


}
