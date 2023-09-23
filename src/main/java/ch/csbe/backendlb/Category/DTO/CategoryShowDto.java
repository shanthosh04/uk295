package ch.csbe.backendlb.Category.DTO;

import ch.csbe.backendlb.Product.DTO.ProductShowDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Schema(description = "DTO for updating a Category")
public class CategoryShowDto {
    // Unique ID for identifying a Category
    @Schema(description = "Unique ID for identifying a Category")
    public Long id;

    // Activity status of a Category
    @Schema(description = "Activity status of a Category")
    public String active;

    // Name of a Category
    @Schema(description = "Name of a Category")
    public String name;

    // Products in a Category
    @Schema(description = "Products in a Category")
    private ProductShowDto toDos;
}
