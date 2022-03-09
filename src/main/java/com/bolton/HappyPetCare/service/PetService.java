package com.bolton.HappyPetCare.service;

import com.bolton.HappyPetCare.model.Pet;
import com.bolton.HappyPetCare.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public List<Pet> findAllPets(){
        return petRepository.findAll();
    }

    public Pet addPet(Pet pet){
        return petRepository.save(pet);
    }

    public Pet updatePet(Pet pet) {
        return petRepository.save(pet);
    }
}
