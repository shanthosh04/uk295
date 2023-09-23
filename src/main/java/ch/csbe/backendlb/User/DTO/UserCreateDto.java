package ch.csbe.backendlb.User.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
@Schema(description = "DTO for creating a user")
public class UserCreateDto {
    // Unique ID of the user
    @NotNull
    @Schema(description = "Unique ID of the user")
    private Long id;

    // First name of the user
    @NotNull
    @Schema(description = "First name of the user")
    private String firstName;

    // Last name of the user
    @NotNull
    @Schema(description = "Last name of the user")
    private String lastName;

    // Username of the user
    @NotNull
    @Schema(description = "Username of the user")
    private String username;

    // Email of the user
    @NotNull
    @Schema(description = "Email of the user")
    private String email;

    // Password of the user
    @NotNull
    @Schema(description = "Password of the user")
    private String password;

    // Birthday (age) of the user
    @NotNull
    @Schema(description = "Birthday of the user")
    private Date birthday;

    // Status indicating whether the user is authenticated
    @NotNull
    @Schema(description = "Status indicating whether the user is authenticated")
    private Boolean authenticated;
}
