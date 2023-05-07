package com.example.workshop.entity;

import lombok.*;
import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String model;
    private String licensePlate;
    private String fuelTipe;
    private int engineDisplacement;
    private int numberDoors;
}
