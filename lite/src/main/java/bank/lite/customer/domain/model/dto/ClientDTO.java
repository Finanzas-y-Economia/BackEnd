package bank.lite.customer.domain.model.dto;

import org.springframework.stereotype.Component;

import java.util.List;

public class ClientDTO{

    private Integer id;
    private String name;
    private String correo;
    private List<UserDTO> users;

    public void setUsername(String username) {
        this.name = username;
    }

    public ClientDTO(Integer id, String name, String correo, List<UserDTO> users) {
        this.id = id;
        this.name = name;
        this.correo = correo;
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }
}
