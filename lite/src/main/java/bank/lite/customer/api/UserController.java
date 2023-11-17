package bank.lite.customer.api;


import bank.lite.customer.domain.model.entities.User;
import bank.lite.customer.domain.service.UserService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;    
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

   @ApiResponses({
            @ApiResponse(
                    responseCode = "201",
                    description = "Reserva creada exitosamente",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = User.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Error en la solicitud",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = RuntimeException.class)
                    )
            )
    })



   @PostMapping
   public ResponseEntity<?> save(@RequestBody User user) {
       try {
           User savedUser = userService.save(user);
           return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
       } catch (Exception e) {

           return new ResponseEntity<>("Error al procesar la solicitud", HttpStatus.BAD_REQUEST);
       }
   }

    @GetMapping
    public List<User> fetchAll() {
        return userService.fetchAll();
    }

    @GetMapping("/{userName}")
    public ResponseEntity<List<User>> getUsersByName(@PathVariable String userName) {
        List<User> users = userService.findByUserName(userName);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    //  un get  que sea find by name usuario
  //  un post para las operaciones
}
