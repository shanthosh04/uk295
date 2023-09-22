package ch.csbe.backendlb.Category.DTO;

import ch.csbe.backendlb.Category.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public abstract class CategoryMapper {

    @Mapping(target = "name", source = "name")
    @Mapping(target = "active", source = "active")

    public abstract Category toEntity(Category categoryCreateDto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "active", source = "active")
    public abstract CategoryShowDto toShowDto(Category category);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "active", source = "active")
    public abstract CategoryDetailDto toDetailDto(Category category);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "active", source = "active")
    public abstract void update(CategoryUpdateDto categoryUpdateDto, @MappingTarget Category category);

}

