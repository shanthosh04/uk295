package ch.csbe.backendlb.Product.DTO;

import ch.csbe.backendlb.Category.DTO.CategoryShowDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ProductUpdateDto {

    // Unique identifier for the product to identify it
    @Schema(description = "Unique ID of a product for identification")
    private Long id;

    // Stock Keeping Unit (SKU) of the product
    @Schema(description = "Product's SKU (Stock Keeping Unit)")
    private String sku;

    // Activity status of the product (e.g., "active" or "inactive")
    @Schema(description = "Activity status of the product")
    private String active;

    // Name of the product
    @Schema(description = "Name of the product")
    private String productName;

    // URL or path to the product's image
    @Schema(description = "Image URL or path of the product")
    private String image;

    // Description of the product
    @Schema(description = "Description of the product")
    private String description;

    // Price of the product
    @Schema(description = "Price of the product")
    private Double price;

    // Available stock quantity of the product
    @Schema(description = "Stock quantity of the product")
    private String stock;

    // Category of the product
    @Schema(description = "Category of the product")
    private CategoryShowDto toDos;
}
