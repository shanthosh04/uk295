package ch.csbe.backendlb.Product.DTO;

import ch.csbe.backendlb.Product.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import ch.csbe.backendlb.Product.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public abstract class ProductMapper {

    // Mapping from ProductCreateDto to Product entity
    @Mapping(target = "sku", source = "sku")
    @Mapping(target = "active", source = "active")
    @Mapping(target = "productName", source = "productName")
    @Mapping(target = "image", source = "images") // Corrected source property name
    @Mapping(target = "description", source = "description")
    @Mapping(target = "price", source = "prise") // Corrected source property name
    @Mapping(target = "stock", source = "stock")
    public abstract Product toEntity(ProductCreateDto productCreateDto);

    // Mapping from Product entity to ProductShowDto
    @Mapping(target = "id", source = "id")
    @Mapping(target = "sku", source = "sku")
    @Mapping(target = "active", source = "active")
    @Mapping(target = "productName", source = "productName")
    @Mapping(target = "image", source = "image")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "stock", source = "stock")
    public abstract ProductShowDto toShowDto(Product product);

    // Mapping from Product entity to ProductDetailDto
    @Mapping(target = "id", source = "id")
    @Mapping(target = "sku", source = "sku")
    @Mapping(target = "active", source = "active")
    @Mapping(target = "productName", source = "productName")
    @Mapping(target = "image", source = "image")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "stock", source = "stock")
    public abstract ProductDetailDto DetailDto(Product product);

    // Update mapping from ProductUpdateDto to an existing Product entity
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

