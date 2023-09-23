package ch.csbe.backendlb.Product.DTO;

import ch.csbe.backendlb.Product.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public abstract class ProductMapper {

    @Mapping(target = "sku", source = "sku")
    @Mapping(target = "active", source = "active")
    @Mapping(target = "productName", source = "productName")
    @Mapping(target = "image", source = "images")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "price", source = "prise")
    @Mapping(target = "stock", source = "stock")
    public static Product toEntity(ProductCreateDto productCreateDto) {
        return null;
    }

    @Mapping(target = "id", source = "id")
    @Mapping(target = "sku", source = "sku")
    @Mapping(target = "active", source = "active")
    @Mapping(target = "productName", source = "productName")
    @Mapping(target = "image", source = "image")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "stock", source = "stock")
    public abstract ProductShowDto toShowDto(Product product);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "sku", source = "sku")
    @Mapping(target = "active", source = "active")
    @Mapping(target = "productName", source = "productName")
    @Mapping(target = "image", source = "image")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "stock", source = "stock")
    public ProductDetailDto DetailDto(Product product) {
        return null;
    }

    @Mapping(target = "id", source = "id")
    @Mapping(target = "sku", source = "sku")
    @Mapping(target = "active", source = "active")
    @Mapping(target = "productName", source = "productName")
    @Mapping(target = "image", source = "image")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "stock", source = "stock")
    public abstract void update(ProductUpdateDto productUpdateDto, @MappingTarget Product productToUpdate);
}
