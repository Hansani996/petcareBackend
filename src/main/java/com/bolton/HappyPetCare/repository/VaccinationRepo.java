package com.bolton.HappyPetCare.repository;

import com.bolton.HappyPetCare.model.Vaccination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationRepo extends JpaRepository<Vaccination,Integer> {
}
