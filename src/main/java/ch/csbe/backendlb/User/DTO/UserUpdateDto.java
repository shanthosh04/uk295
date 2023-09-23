package ch.csbe.backendlb.User.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data

@Schema(description = "DTO for updating user details")
public class UserUpdateDto {
    // First name of the user
    @Schema(description = "First name of the user")
    public String firstName;

    // Last name of the user
    @Schema(description = "Last name of the user")
    public String lastName;

    // Username of the user
    @Schema(description = "Username of the user")
    public String username;

    // Email of the user
    @Schema(description = "Email of the user")
    public String email;

    // Password of the user
    @Schema(description = "Password of the user")
    public String password;

    // Birthday (age) of the user
    @Schema(description = "Birthday of the user")
    public Date birthday;

    // Status indicating whether the user is authenticated
    @Schema(description = "Status indicating whether the user is authenticated")
    public Boolean authenticated;
}
