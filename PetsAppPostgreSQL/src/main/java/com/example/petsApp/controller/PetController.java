package com.example.petsApp.controller;

import com.example.petsApp.entity.Pet;
import com.example.petsApp.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.PushBuilder;
import java.net.PortUnreachableException;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/pet")
public class PetController {
    private final PetService petService;

    @PostMapping("/addPet")
    public ResponseEntity<Pet> createPet(@RequestBody Pet pet) {
        return new ResponseEntity<>(petService.savePet(pet), HttpStatus.OK);
    }

    @GetMapping("/deletePet/{id}")
    public ResponseEntity<String> deletePet(@PathVariable Long id) {
        petService.deletePetById(id);
        return ResponseEntity.ok("Pet " + id + " successfully removed");
    }

    @GetMapping("/getAllPets")
    public List<Pet> getPets(@RequestBody Pet pet) {
        return petService.getAllPets(pet);
    }

    @GetMapping("/findPetById/{id}")
    public ResponseEntity<?> findPetById(@PathVariable Long id) {
        Optional<Pet> petOptional = petService.findPetById(id);
        if (petOptional.isPresent()) {
            Pet pet = petOptional.get();
            return ResponseEntity.ok(pet);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/findPetByName/{name}")
    public ResponseEntity<Boolean> findByName(@PathVariable String name) {
        boolean petExist = petService.existPetByName(name);
        return ResponseEntity.ok(petExist);
    }
}