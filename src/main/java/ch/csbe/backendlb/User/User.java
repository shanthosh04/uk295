package ch.csbe.backendlb.User;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Schema (
        description = "Identifikationsnummer der User",
        example = "1"
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "varchar(255)")
    private String firstname;

    @Column (columnDefinition = "varchar(255)")
    private String lastname;

    @Column (columnDefinition = "varchar(255)")
    private String adress;

    @Column (columnDefinition = "varchar(255)")
    private String city;

    @Column (columnDefinition = "DATE")
    private Date Birthdate;

    @Column (columnDefinition = "varchar(1000)")
    private String Email;

    @Column (columnDefinition = "varchar(200)")
    private String password;

    @Column (columnDefinition = "varchar(200)")
    private String username;

}
