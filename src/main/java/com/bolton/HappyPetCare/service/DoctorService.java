package com.bolton.HappyPetCare.service;

import com.bolton.HappyPetCare.model.Doctor;
import com.bolton.HappyPetCare.repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepo doctorRepo;

    public Doctor create(Doctor doctor){
        return doctorRepo.save(doctor);
    }

    public List<Doctor> findAllMedicalData(){
        return doctorRepo.findAll();
    }
}
