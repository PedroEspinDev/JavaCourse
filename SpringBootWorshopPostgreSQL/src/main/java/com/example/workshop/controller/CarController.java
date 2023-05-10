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
    public List<Car> getCars() {
        return carService.getAllCars();
    }

    @GetMapping("/getCarById/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
        Car car = carService.findById(id);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @PutMapping("/updateCar/{id}")
    public ResponseEntity<String> updateCar(@PathVariable Long id, @RequestBody Car car) {
        Car carTobeUpdated = carService.findById(id);
        carTobeUpdated.setBrand(car.getBrand());
        carTobeUpdated.setModel(car.getModel());
        carTobeUpdated.setLicensePlate(car.getLicensePlate());
        carTobeUpdated.setEngineDisplacement(car.getEngineDisplacement());
        carTobeUpdated.setFuelTipe(car.getFuelTipe());
        carTobeUpdated.setNumberDoors(car.getNumberDoors());
        carService.saveCar(carTobeUpdated);
        return ResponseEntity.ok("Car with id " + id + " updated!");
    }
    @GetMapping("/deleteCar/{id}")
    public ResponseEntity<String> deleteCarById(@PathVariable Long id){
        carService.deleteCar(id);
        return ResponseEntity.ok("Car with id " + id + " deleted!");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateCar(@PathVariable Long id, @RequestBody Car car) throws Exception{
        Car carUpdate= carService.findById(id).orElseThrow();
        carUpdate.setBrand(car.getBrand());
        carUpdate.setModel(car.getz());
        carUpdate.setBrand(car.getBrand());
        carUpdate.setBrand(car.getBrand());
        carUpdate.setBrand(car.getBrand());
        carUpdate.setBrand(car.getBrand());
    }

}
