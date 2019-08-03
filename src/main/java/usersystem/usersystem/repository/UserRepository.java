package usersystem.usersystem.repository;

import usersystem.usersystem.entity.User;

import java.util.Map;

public interface UserRepository {
    void create(User user);

    Map<String, User> list();

    User getById(String id);

    void update(User user);

    void delete(String id);
}
