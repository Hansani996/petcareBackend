package com.bolton.HappyPetCare.repository;

import com.bolton.HappyPetCare.model.MedicalData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalDataRepo extends JpaRepository<MedicalData,Integer> {
}
