package ch.csbe.backendlb.Category;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Schema (
        description = "Category identification number",
        example = "1"
)
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (columnDefinition = "TINYINT")
    private Integer active;

    @Column (columnDefinition = "VARCHAR(255)")
    private String name;

    // Getters and setters for the 'id' field
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getters and setters for the 'active' field
    public String getActive() {
        return getActive();
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    // Getters and setters for the 'name' field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}