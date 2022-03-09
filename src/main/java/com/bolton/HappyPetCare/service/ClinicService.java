package com.bolton.HappyPetCare.service;

import com.bolton.HappyPetCare.model.Clinic;
import com.bolton.HappyPetCare.repository.ClinicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicService {

    @Autowired
    private ClinicRepo clinicRepo;

    public Clinic create(Clinic clinic){
        return clinicRepo.save(clinic);
    }

    public List<Clinic> findAllMedicalData(){
        return clinicRepo.findAll();
    }
}
