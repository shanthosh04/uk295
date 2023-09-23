package ch.csbe.backendlb.Product.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductShowDto {

    // Unique identifier for the product to identify it
    @NotNull
    @Schema(description = "Unique ID of a product for identification")
    private Long id;

    // Stock Keeping Unit (SKU) of the product
    @NotNull
    @Schema(description = "Product's SKU (Stock Keeping Unit)")
    private String sku;

    // Activity status of the product (e.g., "active" or "inactive")
    @NotNull
    @Schema(description = "Activity status of the product")
    private String active;

    // Name of the product
    @NotNull
    @Schema(description = "Name of the product")
    private String productName;

    // URL or path to the product's image
    @NotNull
    @Schema(description = "URL or path to the product's image")
    private String image;

    // Description of the product
    @NotNull
    @Schema(description = "Description of the product")
    private String description;

    // Price of the product
    @NotNull
    @Schema(description = "Price of the product")
    private Double price;

    // Available stock quantity of the product
    @NotNull
    @Schema(description = "Stock quantity of the product")
    private String stock;
}
