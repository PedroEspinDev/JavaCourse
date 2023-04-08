package com.example.ExSpring.Service;

import org.springframework.stereotype.Service;
import com.example.ExSpring.Entity.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<User> users;

    public User users() {
        users = new ArrayList<>();
        users.add(new User(1, "Pedro", "Espin ", "00123456P"));
        users.add(new User(2, "Carla", "Sanchez", "11123456C"));
        users.add(new User(3, "Pepe", "Guillen", "22123456P"));
        users.add(new User(4, "Antonia", "Garcia", "33123456A"));
        return null;
    }

    public List<User> list() {
        return users;
    }

    //User search
    public User find(Long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    //Create user
    public User save(User user) {
        users.add(user);
        return user;
    }

    //Update user

    public User update(int id, User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.equals(user.getId())) {
                updatedUser.setId(id);
                users.set(i, updatedUser);
                return updatedUser;
            }
        }
        return null;
    }

    //Delete user
    public boolean delete(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return users.remove(user);
            }
        }
        return false;
    }
}
