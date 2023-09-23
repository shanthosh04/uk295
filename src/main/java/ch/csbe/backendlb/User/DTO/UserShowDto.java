package ch.csbe.backendlb.User.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
@Schema(description = "DTO for viewing user details")
public class UserShowDto {

    // Unique ID of the user
    @NotNull
    @Schema(description = "Unique ID of the user")
    public Long id;

    // First name of the user
    @NotNull
    @Schema(description = "First name of the user")
    public String firstName;

    // Last name of the user
    @NotNull
    @Schema(description = "Last name of the user")
    public String lastName;

    // Username of the user
    @NotNull
    @Schema(description = "Username of the user")
    public String username;

    // Email of the user
    @NotNull
    @Schema(description = "Email of the user")
    public String email;

    // Password of the user
    @NotNull
    @Schema(description = "Password of the user")
    public String password;

    // Birthday (age) of the user
    @NotNull
    @Schema(description = "Birthday of the user")
    public Date birthday;

    // Status indicating whether the user is authenticated
    @NotNull
    @Schema(description = "Status indicating whether the user is authenticated")
    public Boolean authenticated;
}
