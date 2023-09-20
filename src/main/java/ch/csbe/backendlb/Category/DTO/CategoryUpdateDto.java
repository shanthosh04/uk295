package ch.csbe.backendlb.Category.DTO;


import ch.csbe.backendlb.Product.DTO.ProductShowDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Schema (description = "DTO zum updaten einer Kategory")
public class CategoryUpdateDto {
    @Schema(description = "einmalige Id zum identifiziren einer Kategory")
    public Long id;
    @Schema (description = "aktivitäts status einer Kategory")
    public  String active;
    @Schema (description = "Name einer Kategory")
    public String name;
    @Schema (description = "Produkte einer Kategory")
    private ProductShowDto toDos;
}

