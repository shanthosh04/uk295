package ch.csbe.backendlb.User;

import jakarta.persistence.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BIGINT", nullable = false)
    private Long id;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String firstName;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String lastName;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String username;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String email;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String password;

    @Column(columnDefinition = "DATE", nullable = false)
    private Date birthdate;

    @Column(columnDefinition = "BOOLEAN", nullable = false)
    private Boolean authenticated;

    // Constructors, Getters, and Setters

    // Constructor
    public User() {
    }

    // Getter and Setter for 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for 'firstName'
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for 'lastName'
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for 'username'
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for 'password'
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and Setter for 'birthdate'
    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    // Getter and Setter for 'authenticated'
    public Boolean getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }

    // Method to get roles based on 'authenticated'
    public List<String> getRoles() {
        List<String> roles = new ArrayList<>();
        if (authenticated != null && authenticated) {
            roles.add("ROLE_ADMIN");
        }
        return roles;
    }
}
