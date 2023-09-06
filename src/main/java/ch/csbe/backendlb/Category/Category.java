package ch.csbe.backendlb.Category;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (columnDefinition = "TINYINT")
    private Integer active;

    @Column (columnDefinition = "VARCHAR(255)")
    private String name;
}