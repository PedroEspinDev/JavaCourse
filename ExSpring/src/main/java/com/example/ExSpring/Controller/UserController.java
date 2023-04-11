package com.example.ExSpring.Controller;
import com.example.ExSpring.Entity.User;
import com.example.ExSpring.Service.UserService;
import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/createUser/{id}/{name}/{surname}/{dni}")
    public ResponseEntity<User> create(@PathVariable int id,
                                       @PathVariable String name,
                                       @PathVariable String surname,
                                       @PathVariable String dni) {
        return new ResponseEntity<>(userService.createUser(id, name,surname, dni), HttpStatus.OK);
    }
}
