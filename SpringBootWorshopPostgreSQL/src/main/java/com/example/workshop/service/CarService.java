package com.example.workshop.service;

import com.example.workshop.entity.*;
import com.example.workshop.repository.*;
import lombok.*;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CarService {
    private final ICarRepository carRepository;

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }
}
