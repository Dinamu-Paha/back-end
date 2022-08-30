package dinamupaha.backend.dinamupaha.repository;

import dinamupaha.backend.dinamupaha.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Integer> {
}
