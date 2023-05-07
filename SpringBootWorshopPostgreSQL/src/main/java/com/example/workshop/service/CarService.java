package com.example.workshop.service;

import com.example.workshop.entity.*;
import com.example.workshop.repository.*;
import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CarService {
    private final ICarRepository carRepository;

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }
    public List<Car> getAllCars(){
        return carRepository.findAll();
    }
    public Optional<Car> findById(Long id){
        Optional<Car> optionalCar= carRepository.findById(id);
        return optionalCar;
    }
}
