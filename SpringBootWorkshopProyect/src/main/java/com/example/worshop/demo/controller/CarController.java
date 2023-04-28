package com.example.worshop.demo.controller;

import com.example.worshop.demo.entity.Car;
import com.example.worshop.demo.service.CarService;
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

    @PostMapping("/create")
    public ResponseEntity<Car> create(@RequestBody Car car) {
        return new ResponseEntity<>(carService.saveCar(car), HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deleteCarById(@PathVariable Long id) {
        carService.deleteCarById(id);
        return ResponseEntity.ok("Car with id " + id + " deleted!");
    }

    @GetMapping("/getCars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Car> findCarById(@PathVariable Long id) throws Exception {
        Car car = carService.findById(id).orElseThrow(() -> new Exception("Car with id " + id + " not found"));
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateCarById(@PathVariable Long id, @RequestBody Car car) throws Exception {
        Car carTobeUpdated = carService.findById(id).orElseThrow(() -> new Exception("Car with id " + id + " not found"));
        String carModify = carTobeUpdated.getLicensePlate();
        return ResponseEntity.ok("Car with id " + id + " updated!");
    }
}
