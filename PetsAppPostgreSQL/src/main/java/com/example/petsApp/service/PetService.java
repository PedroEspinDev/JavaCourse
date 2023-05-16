package com.example.petsApp.service;

import com.example.petsApp.entity.Pet;
import com.example.petsApp.repository.IPetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PetService {
    private final IPetRepository petRepository;

    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }
}
