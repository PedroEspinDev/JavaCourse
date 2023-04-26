package com.example.worshop.demo.controller;

import com.example.worshop.demo.entity.Car;
import com.example.worshop.demo.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/car")
public class CarController {
    private final CarService carService;

    @PostMapping
    public ResponseEntity<Car> create(Car car) {
        return new ResponseEntity<>(carService.createCar(car), HttpStatus.OK);
    }
}
