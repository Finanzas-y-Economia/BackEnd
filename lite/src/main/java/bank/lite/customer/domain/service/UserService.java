package bank.lite.customer.domain.service;

import bank.lite.customer.domain.model.entities.User;

import java.util.List;

public interface UserService {

User save(User user);
    List<User> fetchAll();
    List<User> findByUserName(String userName);

    List<User> getAllUsersByClientId(Integer clientId);
}
