package pl.coderslab.tweeter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.tweeter.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findFirstByUsernameOrEmailAllIgnoreCase (String username, String email);
}
