package ch.csbe.backendlb.Product.DTO;

import ch.csbe.backendlb.Category.DTO.CategoryShowDto;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ProductUpdateDto {
    @Schema(description = "einmalige Id eines Produktes zum identifiziren")
    public Long id;
    @Schema (description = "sku eines Produktes")
    public String sku;
    @Schema (description = "aktivitäts status eines Produktes")
    public  String active;
    @Schema (description = "Name eines Produktes")
    public String productName;
    @Schema (description = "Das Bild zu einem Produkt")
    public String image;
    @Schema (description = "BEschreibung eines Produktes")
    public String description;
    @Schema (description = "Preis eines Produktes")
    public Double price;
    @Schema (description = "Lagerbestand eines Produktes")
    public String stock;
    @Schema (description = "Kategory eines Produktes")
    private CategoryShowDto toDos;
}

