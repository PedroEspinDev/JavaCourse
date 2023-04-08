package com.example.demo.service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){

     if (user.getName() == null){
         System.out.println("The name is null " + user.toString());
     }
        String existName= user.getName();

     List<User> userList =userRepository.findAll();

     boolean isTrue= false;
        for(User users :userList ) {
            if(users.getName().equals(existName)){
                isTrue=true;
                System.out.println("Since the username exists, Postman returns null because it already  " + users);
            }
        }
        User userCreate =null;

        if (isTrue == false){

            userCreate = userRepository.save(user);

        }
        return userCreate;
    }

    public List<User> getUsers() {

        return userRepository.findAll();
    }
}
