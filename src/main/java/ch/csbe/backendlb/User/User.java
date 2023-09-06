package ch.csbe.backendlb.User;

import jakarta.persistence.*;

import java.util.Date;

@Entity
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
}
