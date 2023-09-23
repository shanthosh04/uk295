package ch.csbe.backendlb.User.DTO;

import ch.csbe.backendlb.User.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public abstract class UserMapper {

    // Map UserCreateDto to User entity
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "username", source = "username")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "birthday", source = "birthday")
    @Mapping(target = "authenticated", source = "authenticated")
    public abstract User toEntity(UserCreateDto userCreateDto);

    // Map User entity to UserShowDto
    @Mapping(target = "id", source = "id")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "username", source = "username")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "birthday", source = "birthday")
    @Mapping(target = "authenticated", source = "authenticated")
    public abstract UserShowDto ShowDto(User user);

    // Map User entity to UserDetailDto
    @Mapping(target = "id", source = "id")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "username", source = "username")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "birthday", source = "birthday")
    @Mapping(target = "authenticated", source = "authenticated")
    public abstract UserDetailDto DetailDto(User user);

    // Update User entity with UserUpdateDto
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "username", source = "username")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "birthday", source = "birthday")
    @Mapping(target = "authenticated", source = "authenticated")
    public abstract void update(UserUpdateDto userUpdateDto, @MappingTarget User userToUpdate);
}
