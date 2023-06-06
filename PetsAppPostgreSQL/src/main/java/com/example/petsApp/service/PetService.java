package com.example.petsApp.service;

import com.example.petsApp.entity.Pet;
import com.example.petsApp.repository.IPetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PetService {
    private final IPetRepository petRepository;

    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }

    public void deletePetById(Long id) {
        petRepository.deleteById(id);
    }

    public List<Pet> getAllPets(Pet pet) {
        return petRepository.findAll();
    }

    public Optional<Pet> findPetById(Long id) {
        return petRepository.
    }

    public boolean existPetByName(String name) {
        return petRepository.findByName(name) != null ? true : false;
    }
    public Optional<Pet> findPetByName(String name) {
        return petRepository.findPetByName(name);
    }
}
