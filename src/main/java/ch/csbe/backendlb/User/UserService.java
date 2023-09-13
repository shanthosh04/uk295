package ch.csbe.backendlb.User;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public User update(Long id, User user) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User existingUser = userOptional.get();
            existingUser.setId(user.getId());
            return userRepository.save(existingUser);
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User mit der id " + id + " wurde nicht gefunden.");    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public boolean authenticateUser(String email, String password) {
        return false;
    }

    public User registerUser(User user) {
        return null;
    }

    public void distributeUserRights(int userId, List<String> userRights) {
    }
}
