package bank.lite.customer.domain.persistence;

import bank.lite.customer.domain.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository <User,Integer>{
    List<User> findByUserName(String userName);

    List<User> findByClientId(Integer clientId);
}
