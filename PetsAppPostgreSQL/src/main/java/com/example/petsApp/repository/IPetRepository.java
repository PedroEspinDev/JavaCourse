package com.example.petsApp.repository;

import com.example.petsApp.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPetRepository extends JpaRepository<Pet, Long> {

    default boolean existByName(String name) {
        return 
    }
}
