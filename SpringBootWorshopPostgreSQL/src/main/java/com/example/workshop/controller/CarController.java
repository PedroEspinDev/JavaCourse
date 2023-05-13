package com.example.workshop.controller;

import com.example.workshop.entity.Car;
import com.example.workshop.service.CarService;
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

    @PostMapping("/createCar")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        return new ResponseEntity(carService.saveCar(car), HttpStatus.OK);
    }

    @GetMapping("/getAllCars")
    public List<Car> getCars() {
        return carService.getAllCars();
    }

    @GetMapping("/getCarById/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
        Car car = carService.findById(id);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @GetMapping("/deleteCar/{id}")
    public ResponseEntity<String> deleteCarById(@PathVariable Long id) {
        carService.deleteCar(id);
        return ResponseEntity.ok("Car with id " + id + " deleted!");
    }

    @PutMapping("/updateCar/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable Long id, @RequestBody Car car) {
        Car carUpdate = carService.findById(id);
        carUpdate.setBrand(car.getBrand());
        carUpdate.setModel(car.getModel());
        carUpdate.setLicensePlate(car.getLicensePlate());
        carUpdate.setEngineDisplacement(car.getEngineDisplacement());
        carUpdate.setFuelTipe(car.getFuelTipe());
        carUpdate.setNumberDoors(car.getNumberDoors());
        carService.saveCar(carUpdate);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    // IMPLEMENT EXCEPTIONS
    @ControllerAdvice
    public static class GlobalExceptionHandler {
        @ExceptionHandler(CarNotFoundException.class)
        ResponseEntity<Object> handleException(Exception e ) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
