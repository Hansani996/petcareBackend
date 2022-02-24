package com.bolton.HappyPetCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bolton.HappyPetCare.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer>{

}
