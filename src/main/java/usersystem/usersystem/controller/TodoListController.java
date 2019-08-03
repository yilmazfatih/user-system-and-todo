package usersystem.usersystem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usersystem.usersystem.dto.TodoListDto;
import usersystem.usersystem.service.TodoListService;

import java.util.Map;

@RestController
@RequestMapping("/todo-list")
@CrossOrigin
public class TodoListController {

    @Autowired
    private TodoListService todoListService;

    @GetMapping
    public ResponseEntity<Map<String, Boolean>> list() {
        return ResponseEntity.ok(todoListService.list());
    }

    @PostMapping("/create")
    public ResponseEntity<Map<String, Boolean>> create(@RequestBody TodoListDto todoListDto) {
        return ResponseEntity.ok(todoListService.create(todoListDto));
    }

    @PutMapping("/update")
    public ResponseEntity<Map<String, Boolean>> update(@RequestBody TodoListDto todoListDto) {
        return ResponseEntity.ok(todoListService.update(todoListDto));
    }
}
