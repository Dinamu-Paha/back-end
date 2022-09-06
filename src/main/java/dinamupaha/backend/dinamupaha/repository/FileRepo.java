package dinamupaha.backend.dinamupaha.repository;

import dinamupaha.backend.dinamupaha.model.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends JpaRepository<File, String> {
}
