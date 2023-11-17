package bank.lite.customer.service;

import bank.lite.customer.domain.model.entities.User;
import bank.lite.customer.domain.persistence.UserRepository;
import bank.lite.customer.domain.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user) {

        return userRepository.save(user);
    }

    @Override
    public List<User> fetchAll() {

        return userRepository.findAll() ;
    }

    @Override
    public List<User> getAllUsersByClientId(Integer clientId) {
        // Lógica para obtener todos los usuarios de un cliente específico
        return userRepository.findByClientId(clientId);
    }

    @Override
    public List<User> findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

}
