package fabriciocarvalho348.com.github.wsrasmooplus.repository;

import fabriciocarvalho348.com.github.wsrasmooplus.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
