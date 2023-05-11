package com.example.worshop.demo.controller;

import com.example.worshop.demo.entity.Car;
import com.example.worshop.demo.exceptions.CarNotFoundException;
import com.example.worshop.demo.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping("/getCarById/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) throws Exception {
        try {
            Car car = carService.getCarById(id);
            return ResponseEntity.ok(car);
        } catch (CarNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateCarById(@PathVariable Long id, @RequestBody Car car) throws Exception {
        Car carTobeUpdated = carService.getCarById(id);
        carTobeUpdated.setLicensePlate(car.getLicensePlate());
        carTobeUpdated.setHorsePower(car.getHorsePower());
        carTobeUpdated.setBrand(car.getBrand());
        carTobeUpdated.setModel(car.getModel());
        carTobeUpdated.setMaxSpeed(car.getMaxSpeed());
        Car carModify = carService.saveCar(carTobeUpdated);
        return ResponseEntity.ok("Car with id " + id + " updated!");
    }
}


