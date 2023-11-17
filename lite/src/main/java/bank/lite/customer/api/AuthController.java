package bank.lite.customer.api;

import bank.lite.customer.domain.model.dto.ClientDTO;
import bank.lite.customer.domain.model.dto.ClientMapeo;
import bank.lite.customer.domain.model.entities.Client;
import bank.lite.customer.domain.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("")
public class AuthController {


    @Autowired
    private ClienteService clientService;


    @Autowired
    private ClientMapeo clientMapper;



    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Client client) {
        // Validar si el correo electrónico ya está registrado
        if (clientService.findByCorreo(client.getCorreo()) != null) {
            return new ResponseEntity<>("Correo electrónico ya registrado", HttpStatus.BAD_REQUEST);
        }
        clientService.saveClient(client);
        return new ResponseEntity<>("Registro exitoso", HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> loginRequest) {
        String correo = loginRequest.get("correo");
        String password = loginRequest.get("password");
        // Lógica de inicio de sesión
        Client client = clientService.findByCorreo(correo);
        if (client != null && client.getPassword().equals(password)) {
            return new ResponseEntity<>("Login exitoso", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Credenciales inválidas", HttpStatus.UNAUTHORIZED);
        }
    }

    @GetMapping("/clients")
    public Iterable<Client> getAllUsers() {
        // Obtener todos los usuarios
        return clientService.getAllUsers();
    }


    @GetMapping("/{clientId}")
    public ResponseEntity<ClientDTO> getClientWithUsers(@PathVariable Integer clientId) {
        Client client = clientService.getClientById(clientId);

        if (client != null) {
            ClientDTO clientDTO = clientMapper.mapToClientDTO(client);
            return new ResponseEntity<>(clientDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
