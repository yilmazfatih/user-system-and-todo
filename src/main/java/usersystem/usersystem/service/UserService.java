package usersystem.usersystem.service;

import usersystem.usersystem.entity.User;

import java.util.List;

public interface UserService {
    void create(User user);

    List<User> list();

    User getById(String id);

    void update(User user);

    void delete(String id);
}
