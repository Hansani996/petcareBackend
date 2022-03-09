package com.bolton.HappyPetCare.repository;

import com.bolton.HappyPetCare.model.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepo extends JpaRepository<Clinic,Integer> {
}
