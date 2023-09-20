package ch.csbe.backendlb.User;


import ch.csbe.backendlb.User.login.LoginRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; // Importiere die Klasse für die Passwortverschlüsselung


@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder; // Initialisiere die Passwortverschlüsselung

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder(); // Initialisiere die Passwortverschlüsselung
    }

    // ...

    public User getUserWithCredentials(LoginRequestDto loginRequestDto) {
        User user = findUserByEmail(loginRequestDto.getEmail()); if (user != null) {
            boolean isPasswordMatch = passwordEncoder.matches(loginRequestDto.getPassword(), user.getPassword());
            if (isPasswordMatch) {
                return user;
            }
        }
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Ungültige Anmeldeinformationen.");
    }

    public User findUserByEmail(String email) {
        return null;
    }
}
