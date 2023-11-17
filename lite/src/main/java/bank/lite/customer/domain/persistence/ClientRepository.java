package bank.lite.customer.domain.persistence;

import bank.lite.customer.domain.model.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findByCorreo(String correo);
}
