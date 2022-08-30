package dinamupaha.backend.dinamupaha.repository;

import dinamupaha.backend.dinamupaha.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepo extends JpaRepository<Topic, Integer> {
    @Query("select t from Topic t where t.subject = :subject")
    List<Topic> findBySubject(@Param("subject") String subject);
}
