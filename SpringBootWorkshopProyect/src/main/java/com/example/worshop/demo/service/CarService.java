package com.example.worshop.demo.service;

import com.example.worshop.demo.entity.Car;
import com.example.worshop.demo.repository.ICarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CarService {
    private final ICarRepository carRepository;

    public Car createCar(Car car) {
        carRepository.save(car);
        return car;
    }
}
