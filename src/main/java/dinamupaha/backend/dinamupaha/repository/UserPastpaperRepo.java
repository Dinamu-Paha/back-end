package dinamupaha.backend.dinamupaha.repository;

import dinamupaha.backend.dinamupaha.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPastpaperRepo extends JpaRepository<User, Integer> {
}
