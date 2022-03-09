package com.bolton.HappyPetCare.repository;

import com.bolton.HappyPetCare.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor,Integer> {
}
