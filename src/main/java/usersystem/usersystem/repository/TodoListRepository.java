package usersystem.usersystem.repository;

import usersystem.usersystem.dto.TodoListDto;

import java.util.Map;

public interface TodoListRepository {
    Map<String, Boolean> create(TodoListDto todoListDto);

    Map<String, Boolean> list();

    Map<String, Boolean> update(TodoListDto todoListDto);
}
