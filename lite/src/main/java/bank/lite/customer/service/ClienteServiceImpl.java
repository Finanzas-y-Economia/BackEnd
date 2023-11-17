package bank.lite.customer.service;

import bank.lite.customer.domain.model.entities.Client;
import bank.lite.customer.domain.persistence.ClientRepository;
import bank.lite.customer.domain.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Primary
public class ClienteServiceImpl implements ClienteService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClienteServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client findByCorreo(String correo) {
        return clientRepository.findByCorreo(correo);
    }

    @Override
    public List<Client> getAllUsers() {
        List<Client> clients = clientRepository.findAll();
        // Inicializar la colección users antes de devolver la lista
        clients.forEach(client -> client.getUsers().size());
        return clients;
    }
    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
    @Override
    public Client getClientById(Integer clientId) {
        // Lógica para obtener un cliente por ID desde la base de datos
        // Puedes usar el repository u otros métodos según tu implementación
        return clientRepository.findById(clientId).orElse(null);
    }

}
