package com.example.workshop.service;

import com.example.workshop.entity.*;
import com.example.workshop.repository.*;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class CarService {
    private final ICarRepository carRepository;

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car findById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
