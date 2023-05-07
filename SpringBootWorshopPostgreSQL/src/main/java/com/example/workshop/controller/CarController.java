package com.example.workshop.controller;

import com.example.workshop.entity.Car;
import com.example.workshop.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@RestController
@RequestMapping("/car")
public class CarController {
    private final CarService carService;

    @PostMapping("/createCar")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        return new ResponseEntity(carService.saveCar(car), HttpStatus.OK);
    }

    @GetMapping("/getAllCars")
    public List<Car> getCars(Car car) {
        return carService.getAllCars();
    }

    @GetMapping("/getCarById/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
        Car car = carService.findById(id).orElse(null);
        if (car != null) {
            return ResponseEntity.ok(car);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @PutMapping("/update/{id}")

}
