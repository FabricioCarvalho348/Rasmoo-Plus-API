package fabriciocarvalho348.com.github.wsrasmooplus.repository;

import fabriciocarvalho348.com.github.wsrasmooplus.model.UserPaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPaymentInfoRepository extends JpaRepository<UserPaymentInfo, Long> {
}
