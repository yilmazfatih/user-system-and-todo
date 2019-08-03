package usersystem.usersystem.repository.impl;

import org.springframework.stereotype.Repository;
import usersystem.usersystem.dto.TodoListDto;
import usersystem.usersystem.repository.TodoListRepository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TodoListRepositoryImpl implements TodoListRepository {

    private static Map<String, Boolean> todoList = new HashMap<>();

    @Override
    public Map<String, Boolean> create(TodoListDto todoListDto) {
        todoList.put(todoListDto.getKey(), todoListDto.getValue());
        return list();
    }

    @Override
    public Map<String, Boolean> list() {
        return todoList;
    }

    @Override
    public Map<String, Boolean> update(TodoListDto todoListDto) {
        todoList.put(todoListDto.getKey(), todoListDto.getValue());
        return list();
    }
}
