package com.bolton.HappyPetCare.service;

import com.bolton.HappyPetCare.model.MedicalData;
import com.bolton.HappyPetCare.repository.MedicalDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalDataService {
    @Autowired
    private MedicalDataRepo medicalDataRepo;

    public MedicalData create(MedicalData medicalData){
        return medicalDataRepo.save(medicalData);
    }

    public List<MedicalData> findAllMedicalData(){
        return medicalDataRepo.findAll();
    }
}
