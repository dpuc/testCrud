package dpucp.working.testCrud.repository;

import org.springframework.stereotype.Repository;
import dpucp.working.testCrud.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
