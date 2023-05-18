package com.example.petsApp.repository;

import com.example.petsApp.entity.Pet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPetRepository extends JpaRepository<Pet, Long> {
    Pet findByName(String name);
    @Query(value = "SELECT * FROM pet WHERE name =:name",nativeQuery = true)
    Optional<Pet> findPetByName(@Param("name") String name);
}
