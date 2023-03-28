package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/createUser/{name}/{surname}")
    public ResponseEntity<User> createUser(@PathVariable String name,
                                           @PathVariable String surname) {

        User user = userService.generateUser(name, surname);

        return new ResponseEntity<>(user, HttpStatus.OK);

    }

    @GetMapping("/getAllUsers")

    public ResponseEntity<List<User>> getAllUsers() {

        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @PutMapping("/updateUser/{name}")
    public ResponseEntity<User> updateUser(@PathVariable String name,
                                           @RequestBody User updateUser) {

        User user = (User) userService.updateUser(name);

        return new ResponseEntity<>(updateUser, HttpStatus.CREATED);
    }
}

