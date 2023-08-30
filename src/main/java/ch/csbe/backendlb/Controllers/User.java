package ch.csbe.backendlb.Controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign")
public class User {

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
}
