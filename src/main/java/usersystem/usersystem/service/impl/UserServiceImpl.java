package usersystem.usersystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usersystem.usersystem.entity.User;
import usersystem.usersystem.repository.UserRepository;
import usersystem.usersystem.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(User user) {
        userRepository.create(user);
    }

    @Override
    public List<User> list() {
        return userRepository.list().values().stream().collect(Collectors.toList());
    }

    @Override
    public void update(User user) {
        userRepository.update(user);
    }

    @Override
    public void delete(String id) {
        userRepository.delete(id);
    }

    @Override
    public User getById(String id) {
        return userRepository.getById(id);
    }
}
