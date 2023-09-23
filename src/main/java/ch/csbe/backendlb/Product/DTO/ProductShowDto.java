package ch.csbe.backendlb.Product.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductShowDto {
    @NotNull
    @Schema(description = "Einmalige ID eines Produkts zur Identifizierung")
    public Long id;
    @NotNull
    @Schema(description = "SKU eines Produkts")
    public String sku;
    @NotNull
    @Schema(description = "Aktivitätsstatus eines Produkts")
    public String active;
    @NotNull
    @Schema(description = "Name eines Produkts")
    public String productName;
    @NotNull
    @Schema(description = "Das Bild zu einem Produkt")
    public String image; // Corrected property name
    @NotNull
    @Schema(description = "Beschreibung eines Produkts")
    public String description;
    @NotNull
    @Schema(description = "Preis eines Produkts")
    public Double price; // Corrected property name
    @NotNull
    @Schema(description = "Lagerbestand eines Produkts")
    public String stock;
}
