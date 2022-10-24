package dinamupaha.backend.dinamupaha.repository;

import dinamupaha.backend.dinamupaha.model.UserQuiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserQuizRepo extends JpaRepository<UserQuiz, Integer> {
    @Query("select u from UserQuiz u where u.userId = :userId")
    List<UserQuiz> getQuizMarksOfStudent(int userId);
}
