package ch.csbe.backendlb.User;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Schema (
        description = "Identifikationsnummer der User",
        example = "1"
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = ("int"),nullable = false)
    private Long id;

    @Column(columnDefinition = "varchar(255)")
    private String firstname;

    @Column (columnDefinition = "varchar(255)")
    private String lastname;

    @Column (columnDefinition = "varchar(200)")
    private String username;

    @Column (columnDefinition = "varchar(255)")
    private String adress;

    @Column (columnDefinition = "varchar(255)")
    private String city;

    @Column (columnDefinition = "DATE")
    private Date birthdate;

    @Column (columnDefinition = "varchar(1000)")
    private String Email;

    @Column (columnDefinition = "varchar(200)")
    private String password;

    @Column (columnDefinition = "boolean")
    private Boolean authenticated;

    public Long getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
    public String getadress() {
        return adress;
    }
    public void setadress(String adress){
        this.adress = adress;
    }
    public String getcity() {
        return city;
    }
    public void setcity(String city){
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthdate;
    }

    public void setBirthdate (Date birthday) {
        this.birthdate = birthdate;
    }

    public Boolean getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }


    public List<String> getRoles() {
        List<String> hardcodedRoles = new ArrayList<>();
        hardcodedRoles.add("ROLE_ADMIN");
        return hardcodedRoles;
    }

}
