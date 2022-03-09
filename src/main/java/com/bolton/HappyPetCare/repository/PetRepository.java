package com.bolton.HappyPetCare.repository;

import com.bolton.HappyPetCare.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer>{

}
