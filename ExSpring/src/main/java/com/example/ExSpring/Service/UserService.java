package com.example.ExSpring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ExSpring.Entity.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private User user;

    public User createUser(int id, String name, String surname, String dni) {
        User user1 = new User(id, name, surname, dni);
        return user1;
    }
}
