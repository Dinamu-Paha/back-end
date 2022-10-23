package dinamupaha.backend.dinamupaha.repository;

import dinamupaha.backend.dinamupaha.model.Subtopic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SubtopicRepo extends JpaRepository<Subtopic, Integer> {
    @Query("from Subtopic s where s.subject_id = :subjectId")
    List<Subtopic> findBySubjectId(int subjectId);
}
