package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User generateUser(String name, String surname) {

        User user = User.builder()
                .name(name)
                .surname(surname)
                .build();
        userRepository.save(user);
        return user;
    }

    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    public User updateUser(String name) {
        User existingUser = (User) getAllUsers();

        return null;
    }
}

