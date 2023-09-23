package ch.csbe.backendlb.Category;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Schema (
        description = "Identifikationsnummer der Category",
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActive() {
        return getActive();
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}