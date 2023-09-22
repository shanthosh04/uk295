package ch.csbe.backendlb.User;

import ch.csbe.backendlb.Product.ProductService;
import ch.csbe.backendlb.User.DTO.UserMapper;
import ch.csbe.backendlb.User.login.LoginRequestDto;
import ch.csbe.backendlb.User.login.TokenService;
import ch.csbe.backendlb.User.login.TokenWrapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Tag(name = "UserController", description = "Hier finden sich alle Endpoints für Benutzer")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;

    @PostMapping("/authenticate")
    @Operation(
            operationId = "AuthenticateUser",
            summary = "Authentifizierung",
            description = "Dieser Endpunkt ermöglicht die Authentifizierung des Benutzers."
    )
    public String authenticate() {
        return "Authentifizierung erfolgreich";
    }

    @PostMapping("/register")
    @Operation(
            operationId = "RegisterUser",
            summary = "Registrierung",
            description = "Dieser Endpunkt ermöglicht die Registrierung eines neuen Benutzers."
    )
    public String register() {
        return "Registrierung erfolgreich";
    }

    @PostMapping("/")
    @Operation(
            operationId = "DistributeUser",
            summary = "Benutzerrechte verteilen",
            description = "Dieser Endpunkt ermöglicht die Verteilung von Benutzerrechten."
    )
    public String distributeUserRights() {
        return "Benutzerrechte erfolgreich verteilt";
    }

    @DeleteMapping("/")
    @Operation(
            operationId = "DeleteUser",
            summary = "Benutzer löschen",
            description = "Dieser Endpunkt ermöglicht das Löschen eines Benutzers."
    )
    public String deleteUser() {
        return "Benutzerrechte erfolgreich gelöscht";
    }
}
