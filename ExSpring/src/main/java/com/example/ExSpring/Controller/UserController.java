package com.example.ExSpring.Controller;
import com.example.ExSpring.Entity.User;
import com.example.ExSpring.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserService userService;

    //Get list of users
    @GetMapping
    public Iterable<User> list() {
        return userService.list();
    }
    //User seach
    @GetMapping("/{id}")
    public ResponseEntity<User> find(@PathVariable("id") int id) {
        User user = userService.users.get(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    //Create user
    @PostMapping
    public ResponseEntity<User> create(User user) {
        User user1 = userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    //Update user
    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable("id") int id,
                                       @RequestBody User user) {
        userService.update(id, user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //Delete user
    /*
    @DeleteMapping("/{id}")
    public boolean detele(@PathVariable("id") int id) {
        User user = userService.delete(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
     */
}
