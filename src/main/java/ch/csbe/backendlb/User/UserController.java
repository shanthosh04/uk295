package ch.csbe.backendlb.User;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign")
public class UserController {

    @PostMapping("/authenticate")
    public String authenticate() {

        return "Authentifizierung erfolgreich";
    }

    @PostMapping("/register")
    public String register() {

        return "Registrierung erfolgreich";
    }

    @PostMapping("/" )
    public String distributeUserRights() {

        return "Benutzerrechte erfolgreich verteilt";
    }

    @DeleteMapping("/")
    public String deleteUser() {
        return "Brnutzerrechte erfolgreich löschen";
    }
}
