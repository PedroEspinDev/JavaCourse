package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Service
public class UserService {

    public User generateUser(Long id, int age, String gender, String name) {

        User user = new User(id, age, gender, name);

        return user;
    }

    public List<User> getAllUsers() {
        User user1 = new User(1L, 14, "M", "Fran");
        User user2 = new User(2L, 15, "F", "Luisa");

        List<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);

        return users;
    }

    public User getUserId(long id) {

        User user1 = new User(1L, 14, "M", "Fran");
        User user2 = new User(2L, 15, "F", "Luisa");

        List<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);

        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsersByGender(String gender) {

        User user1 = new User(1L, 27, "M", "Pedro");
        User user2 = new User(2L, 26, "F", "Paula");
        User user3 = new User(3L, 28, "M", "Francisco Jose");
        User user4 = new User(4L, 31, "F", "Maria");
        User user5 = new User(5L, 57, "M", "Jose");
        User user6 = new User(6L, 82, "F", "Catalina");

        List<User> users = new ArrayList();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);

        List<User> usersByGender = new ArrayList();

        for (User user : users) {

            if (user.getGender().equals(gender)) {
                usersByGender.add(user);
            }
        }
        return usersByGender;
    }
}
