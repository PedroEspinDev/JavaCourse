package com.example.testFootball.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Invalid data, enter valid name.")
    private String name;

    private String city;

    private String owner;

    @Positive
    private Integer stadiumCapacity;

    @Max(3)
    @Min(1)
    private Integer division;

    private String competition;

    private Integer numberOfPlayers;

    private String creationDate;
}
