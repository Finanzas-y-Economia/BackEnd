package bank.lite.customer.domain.service;

import bank.lite.customer.domain.model.entities.Client;
import bank.lite.customer.domain.persistence.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {
    Client saveClient(Client client);

    Client findByCorreo(String correo);

    List<Client> getAllUsers();

    List<Client> getAllClients();

    Client getClientById(Integer clientId);
}
