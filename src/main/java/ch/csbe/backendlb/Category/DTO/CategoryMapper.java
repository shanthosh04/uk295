package ch.csbe.backendlb.Category.DTO;

import ch.csbe.backendlb.Category.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

// Mapper for converting Category-related DTOs and entities.
@Mapper(componentModel = "spring")
public abstract class CategoryMapper {

    // Maps a CategoryCreateDto to a Category entity.
    @Mapping(target = "name", source = "name")
    @Mapping(target = "active", source = "active")
    public abstract Category toEntity(Category categoryCreateDto);

    // Maps a Category entity to a CategoryShowDto.
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "active", source = "active")
    public abstract CategoryShowDto toShowDto(Category category);

    // Maps a Category entity to a CategoryDetailDto.
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "active", source = "active")
    public abstract CategoryDetailDto toDetailDto(Category category);

    // Updates a Category entity based on a CategoryUpdateDto.
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "active", source = "active")
    public abstract void update(CategoryUpdateDto categoryUpdateDto, @MappingTarget Category category);
}
