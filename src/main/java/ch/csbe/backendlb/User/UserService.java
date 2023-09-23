package ch.csbe.backendlb.User;

import ch.csbe.backendlb.User.DTO.*;
import ch.csbe.backendlb.login.LoginRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    // Retrieve a list of all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user details by ID
    public UserDetailDto getUserById(Long id) {
        User userEntity = userRepository.getById(id);
        return userMapper.DetailDto(userEntity);
    }

    // Create a new user
    public UserDetailDto createUser(UserCreateDto user) {
        User savedUser = userRepository.save(userMapper.toEntity(user));
        return userMapper.DetailDto(savedUser);
    }

    // Update user details
    public UserDetailDto updateUser(Long id, UserUpdateDto user) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User existingUser = userOptional.get();
            userMapper.update(user, existingUser);
            return userMapper.DetailDto(userRepository.save(existingUser));
        }
        return userMapper.DetailDto(new User());
    }

    // Delete a user by ID
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    // Register a new user
    public UserShowDto registerUser(UserCreateDto userCreateDto) {
        User userEntity = userMapper.toEntity(userCreateDto);
        String hashedPassword = encoder.encode(userCreateDto.getPassword());
        userEntity.setPassword(hashedPassword);
        userRepository.save(userEntity);
        return userMapper.ShowDto(userEntity);
    }

    // Find a user by email
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    // Get a user with credentials for login
    public User getUserWithCredentials(LoginRequestDto loginRequestDto) {
        User user = findUserByEmail(loginRequestDto.getEmail());
        if (user != null) {
            boolean isPasswordMatch = encoder.matches(loginRequestDto.getPassword(), user.getPassword());
            if (isPasswordMatch) {
                return user;
            }
        }
        return null;
    }
}
