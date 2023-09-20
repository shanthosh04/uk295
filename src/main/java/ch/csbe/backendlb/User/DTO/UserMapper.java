package ch.csbe.backendlb.User.DTO;

import ch.csbe.backendlb.User.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public abstract class UserMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "username", source = "username")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "adress", source = "adress")
    @Mapping(target = "city", source = "city")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "birthdate", source = "birthdate")
    @Mapping(target = "authenticated", source = "authenticated")
    public abstract User Entity(UserCreateDto userCreateDto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "username", source = "username")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "adress", source = "adress")
    @Mapping(target = "city", source = "city")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "birthdate", source = "birthdate")
    @Mapping(target = "authenticated", source = "authenticated")
    public abstract UserShowDto ShowDto(User user);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "username", source = "username")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "adress", source = "adress")
    @Mapping(target = "city", source = "city")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "birthdate", source = "birthdate")
    @Mapping(target = "authenticated", source = "authenticated")
    public static UserDetailDto DetailDto(User user) {
        return null;
    }

    @Mapping(target = "id", source = "id")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "username", source = "username")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "adress", source = "adress")
    @Mapping(target = "city", source = "city")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "birthdate", source = "birthdate")
    @Mapping(target = "authenticated", source = "authenticated")
    public abstract void update(UserUpdateDto userUpdateDto, @MappingTarget User user);


}

