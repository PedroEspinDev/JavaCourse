package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user/create")
    public ResponseEntity<User> create(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userService.getUsers();
        if (users.isEmpty()) {
            throw new EntityNotFoundException("The list of users is emty ");
        }
        return ResponseEntity.ok(users);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> findById(@PathVariable Long Id) {
        return ResponseEntity.ok(userService.findById(Id));
    }
    @DeleteMapping("/user/delete/{Id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long Id){
        userService.deleteById(Id);
        return ResponseEntity.noContent().build();
    }
}
