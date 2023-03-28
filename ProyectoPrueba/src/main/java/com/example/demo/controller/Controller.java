package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{age}/{gender}/{name}")
    public ResponseEntity<User> getUser(@PathVariable Long id,
                                        @PathVariable int age,
                                        @PathVariable String gender,
                                        @PathVariable String name) {

        User user = userService.generateUser(id, age, gender, name);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getUsers() {

        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/getUserId/{id}")
    public ResponseEntity<User> getUserId(@PathVariable long id) {

        return new ResponseEntity<>(userService.getUserId(id), HttpStatus.OK);
    }

    @GetMapping("/getAllUsersByGender/{gender}")
    public ResponseEntity<List<User>> getAllUsersByGender(@PathVariable String gender) {

        return new ResponseEntity<>(userService.getAllUsersByGender(gender), HttpStatus.OK);
    }
}


