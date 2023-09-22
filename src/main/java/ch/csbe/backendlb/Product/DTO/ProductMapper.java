package ch.csbe.backendlb.Product.DTO;

import ch.csbe.backendlb.Product.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public abstract class ProductMapper {

    @Mapping(target = "sku", source = "sku")
    @Mapping(target = "active", source = "active")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "images", source = "images")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "prise", source = "prise")
    @Mapping(target = "stock", source = "stock")
    public abstract Product toEntity(ProductCreateDto productCreateDto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "sku", source = "sku")
    @Mapping(target = "active", source = "active")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "images", source = "images")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "prise", source = "prise")
    @Mapping(target = "stock", source = "stock")
    public abstract ProductShowDto toShowDto(Product product);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "sku", source = "sku")
    @Mapping(target = "active", source = "active")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "images", source = "images")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "prise", source = "prise")
    @Mapping(target = "stock", source = "stock")
    public static ProductDetailDto DetailDto(Product productEntitie) {
        return null;
    }

    @Mapping(target = "id", source = "id")
    @Mapping(target = "sku", source = "sku")
    @Mapping(target = "active", source = "active")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "images", source = "images")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "prise", source = "prise")
    @Mapping(target = "stock", source = "stock")
    public abstract void update(ProductUpdateDto productUpdateDto, @MappingTarget Product productToUpdate);

}


