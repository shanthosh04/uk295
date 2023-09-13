package ch.csbe.backendlb.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign")
@Tag(name = "UserController", description = "Hier finden sich alle Endpoints für Benutzer")
public class UserController {

    @PostMapping("/authenticate")
    @Operation(
            summary = "Authentifizierung",
            description = "Dieser Endpunkt ermöglicht die Authentifizierung des Benutzers."
    )
    public String authenticate() {
        return "Authentifizierung erfolgreich";
    }

    @PostMapping("/register")
    @Operation(
            summary = "Registrierung",
            description = "Dieser Endpunkt ermöglicht die Registrierung eines neuen Benutzers."
    )
    public String register() {
        return "Registrierung erfolgreich";
    }

    @PostMapping("/")
    @Operation(
            summary = "Benutzerrechte verteilen",
            description = "Dieser Endpunkt ermöglicht die Verteilung von Benutzerrechten."
    )
    public String distributeUserRights() {
        return "Benutzerrechte erfolgreich verteilt";
    }

    @DeleteMapping("/")
    @Operation(
            summary = "Benutzer löschen",
            description = "Dieser Endpunkt ermöglicht das Löschen eines Benutzers."
    )
    public String deleteUser() {
        return "Benutzerrechte erfolgreich gelöscht";
    }
}
