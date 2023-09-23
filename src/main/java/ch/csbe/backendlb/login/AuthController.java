package ch.csbe.backendlb.login;

import ch.csbe.backendlb.User.DTO.UserCreateDto;
import ch.csbe.backendlb.User.DTO.UserShowDto;
import ch.csbe.backendlb.User.User;
import ch.csbe.backendlb.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {
    @Autowired
    UserService userService;

    @Autowired
    TokenService tokenService;

    @PostMapping("login")
    public TokenWrapper login(@RequestBody LoginRequestDto loginRequestDto) {
        // Attempt to authenticate the user with provided credentials
        User user = userService.getUserWithCredentials(loginRequestDto);

        if (user != null) {
            // If authentication is successful, generate a token
            TokenWrapper tokenWrapper = new TokenWrapper();
            String token = tokenService.generateToken(user);
            tokenWrapper.setToken(token);
            return tokenWrapper;
        } else {
            // If authentication fails, return null
            return null;
        }
    }

    @PostMapping("register")
    public UserShowDto register(@RequestBody UserCreateDto userCreateDto) {
        // Register a new user and return their details
        return userService.registerUser(userCreateDto);
    }
}
