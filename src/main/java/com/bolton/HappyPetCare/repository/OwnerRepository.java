package com.bolton.HappyPetCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolton.HappyPetCare.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer>{

//	void deleteOwenerbyId(int ownerId);

}
