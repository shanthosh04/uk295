package ch.csbe.backendlb.User.login;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginRequestDto {
    @NotNull
    private String email;
    @NotNull
    private String password;
}
