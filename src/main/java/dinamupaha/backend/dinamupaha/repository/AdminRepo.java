package dinamupaha.backend.dinamupaha.repository;

import dinamupaha.backend.dinamupaha.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepo extends JpaRepository<Admin, String> {
    @Query
            ("select a from Admin a where a.userName = :userName and a.password = :password")
    List<Admin> findByUserName(String userName, String password);
}
