package usersystem.usersystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usersystem.usersystem.entity.User;
import usersystem.usersystem.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public ResponseEntity<List<User>> list() {
        return ResponseEntity.ok(userService.list());
    }

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody User user) {
        userService.create(user);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update")
    public ResponseEntity update(@RequestBody User user) {
        userService.update(user);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete")
    public ResponseEntity delete(@RequestParam("id") String id) {
        userService.delete(id);
        return ResponseEntity.ok().build();
    }
}
