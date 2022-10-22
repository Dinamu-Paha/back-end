package dinamupaha.backend.dinamupaha.repository;

import dinamupaha.backend.dinamupaha.model.Subtopic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubtopicRepo extends JpaRepository<Subtopic, Integer> {
    @Query("select s from Subtopic s")
    public List<Subtopic> findSubtopics(int subjectId);
}
