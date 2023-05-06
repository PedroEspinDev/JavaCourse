package com.example.workshop.controller;

import com.example.workshop.entity.Car;
import com.example.workshop.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/car")
public class CarController {
    private final CarService carService;

    @PostMapping("/createCar")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        return new ResponseEntity(carService.saveCar(car), HttpStatus.OK);
    }
}
