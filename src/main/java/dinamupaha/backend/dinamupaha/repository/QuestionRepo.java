package dinamupaha.backend.dinamupaha.repository;

import com.sun.mail.util.QEncoderStream;
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
            ("from Question q where q.subjectId = :subjectId")
    List<Question> getQuestionBySubject(int subjectId);
    @Query
            ("select distinct(q.quizName) from Question  q where q.quizName is not null")
    List<String> getQuizzes();
    @Query
            ("from Question q where q.quizName = :quizName")
    List<Question> getQuestionsOfQuiz(String quizName);

    @Query
            ("select distinct(q.pastpaperYear) from Question q where q.pastpaperYear is not null order by q.pastpaperYear")
    List<Integer> getPastpaper();

    @Query
            ("from Question q where q.pastpaperYear = :year")
    List<Question> getPastpaperOfYear(int year);

    @Query
            ("from Question q where q.subtopicId = :subtopicId and q.pastpaperYear is not null")
    List<Question> getQuestionOfPastpaperAndSubtopic(int subtopicId);
}
