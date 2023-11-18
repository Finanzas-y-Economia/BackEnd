package bank.lite.customer.domain.model.dto;

import bank.lite.customer.domain.model.entities.Client;
import bank.lite.customer.domain.model.entities.User;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class ClientMapeo {



    public ClientDTO mapToClientDTO(Client client) {
        List<UserDTO> userDTOs = client.getUsers().stream()
                .map(this::mapToUserDTO)
                .collect(Collectors.toList());

        // Mapear campos del cliente
        ClientDTO clientDTO = new ClientDTO(
                client.getId(),
                client.getName(),
                client.getCorreo(),
                userDTOs
        );

        // Otros campos de inicio de sesión en Client
        // clientDTO.setOtrasPropiedades(...);

        return clientDTO;
    }

    public UserDTO mapToUserDTO(User user) {
        // Mapear campos del usuario
        UserDTO userDTO = new UserDTO(
                user.getId(),
                user.getUserName(),
                user.getPrecio_activo(),
                user.getPlan_pago(),
                user.getP_cuota_inicial(),
                user.getP_tasa_interes(),
                user.getT_tasa_interes(),
                user.getCoste_notarial(),
                user.getCoste_registral(),
                user.getTasacion(),
                user.getComision_estudio(),
                user.getComision_activacion(),
                user.getGps(),
                user.getPortes(),
                user.getGastos_administracion()
        );
        return userDTO;
    }
}
