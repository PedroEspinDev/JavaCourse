package com.example.worshop.demo.repository;

import com.example.worshop.demo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarRepository extends JpaRepository<Car, Long> {
}
