package com.example.petsApp.controller;

import com.example.petsApp.entity.Pet;
import com.example.petsApp.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/pet")
public class PetController {
    private final PetService petService;

    @PostMapping("/addPet")
    public ResponseEntity<Pet> createPet(@RequestBody Pet pet){
        return new ResponseEntity<>(petService.savePet(pet), HttpStatus.OK);
    }
}
