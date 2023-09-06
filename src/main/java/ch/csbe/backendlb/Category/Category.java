package ch.csbe.backendlb.Category;

import jakarta.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (columnDefinition = "TINYINT")
    private Integer active;

    @Column (columnDefinition = "VARCHAR(255)")
    private String name;
}