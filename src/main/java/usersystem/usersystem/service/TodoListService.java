package usersystem.usersystem.service;

import usersystem.usersystem.dto.TodoListDto;

import java.util.Map;

public interface TodoListService {
    Map<String, Boolean> create(TodoListDto todoListDto);

    Map<String, Boolean> list();

    Map<String, Boolean> update(TodoListDto todoListDto);
}
