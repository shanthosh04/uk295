package ch.csbe.backendlb.Product.DTO;

import ch.csbe.backendlb.Category.DTO.CategoryShowDto;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
public class ProductDetailDto {
    @NotNull
    @Schema(description = "einmalige Id eines Produktes zum identifiziren")
    public Long id;
    @NotNull
    @Schema (description = "sku eines Produktes")
    public String sku;
    @NotNull
    @Schema (description = "aktivitäts status eines Produktes")
    public  String active;
    @NotNull
    @Schema (description = "Name eines Produktes")
    public String productName;
    @NotNull
    @Schema (description = "Das Bild zu einem Produkt")
    public String image;
    @NotNull
    @Schema (description = "BEschreibung eines Produktes")
    public String description;
    @NotNull
    @Schema (description = "Preis eines Produktes")
    public Double price;
    @NotNull
    @Schema (description = "Lagerbestand eines Produktes")
    public String stock;
    @NotNull
    @Schema (description = "Kategory eines Produktes")
    private CategoryShowDto toDos;
}

