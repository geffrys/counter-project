package com.geff.nopmocounter.infraestructure.repository.mapper;
import com.geff.nopmocounter.domain.entity.User;
import com.geff.nopmocounter.infraestructure.repository.entity.UserEntity;
public class UserMapper {
    public static User toDomain(UserEntity userEntity) {
        if (userEntity == null) {
            return null;
        }
        User user = new User();
        user.setUserId(userEntity.getUserId());
        user.setUserEmail(userEntity.getUserEmail());
        user.setUserPassword(userEntity.getUserPassword());
        user.setUpdatedAt(userEntity.getUpdatedAt());
        user.setCreatedAt(userEntity.getCreatedAt());
        user.setIsLocked(userEntity.getIsLocked());
        user.setIsActive(userEntity.getIsActive());
        return user;
    }

    public static UserEntity toEntity(User user) {
        if (user == null) {
            return null;
        }
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(user.getUserId());
        userEntity.setUserEmail(user.getUserEmail());
        userEntity.setUserPassword(user.getUserPassword());
        userEntity.setUpdatedAt(user.getUpdatedAt());
        userEntity.setCreatedAt(user.getCreatedAt());
        userEntity.setIsLocked(user.getIsLocked());
        userEntity.setIsActive(user.getIsActive());
        return userEntity;
    }
}
