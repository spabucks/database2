package starbucks.users.repository;

import lombok.Builder;
import org.springframework.data.jpa.repository.JpaRepository;
import starbucks.users.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
