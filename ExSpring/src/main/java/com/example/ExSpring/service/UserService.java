package com.example.ExSpring.service;

import com.example.ExSpring.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.ExSpring.entity.User;

@RequiredArgsConstructor
@Service
public class UserService {

    private final IUserRepository userRepository;

    public User createUser(User user) {
        userRepository.save(user);
        return user;
    }
}
