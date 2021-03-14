package redis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import redis.user.User;

@Repository
public interface UserRepository extends JpaRepository {
    User findOne(Long valueOf);
}

