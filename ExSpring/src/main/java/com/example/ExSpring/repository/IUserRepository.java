package com.example.ExSpring.repository;
import com.example.ExSpring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long>{
}

