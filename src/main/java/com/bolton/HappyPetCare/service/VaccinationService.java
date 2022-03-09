package com.bolton.HappyPetCare.service;

import com.bolton.HappyPetCare.model.Vaccination;
import com.bolton.HappyPetCare.repository.VaccinationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccinationService {
    @Autowired
    private VaccinationRepo vaccinationRepo;

    public Vaccination create(Vaccination vaccination){
        return vaccinationRepo.save(vaccination);
    }

    public List<Vaccination> findAllVaccinations(){
        return vaccinationRepo.findAll();
    }
}
