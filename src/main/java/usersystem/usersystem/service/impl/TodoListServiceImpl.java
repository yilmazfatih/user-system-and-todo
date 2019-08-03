package usersystem.usersystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usersystem.usersystem.dto.TodoListDto;
import usersystem.usersystem.repository.TodoListRepository;
import usersystem.usersystem.service.TodoListService;

import java.util.Map;

@Service
public class TodoListServiceImpl implements TodoListService {

    @Autowired
    private TodoListRepository todoListRepository;

    @Override
    public Map<String, Boolean> create(TodoListDto todoListDto) {
        return todoListRepository.create(todoListDto);
    }

    @Override
    public Map<String, Boolean> list() {
        return todoListRepository.list();
    }

    @Override
    public Map<String, Boolean> update(TodoListDto todoListDto) {
        return todoListRepository.update(todoListDto);
    }
}
