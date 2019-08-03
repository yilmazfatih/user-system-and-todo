package usersystem.usersystem.repository.impl;

import org.springframework.stereotype.Repository;
import usersystem.usersystem.entity.User;
import usersystem.usersystem.repository.UserRepository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private static Map<String, User> users = new HashMap<>();

    @Override
    public void create(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public Map<String, User> list() {
        return users;
    }

    @Override
    public void update(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public void delete(String id) {
        users.remove(id);
    }

    @Override
    public User getById(String id) {
        return users.get(id);
    }
}
