package com.bolton.HappyPetCare.repository;

import com.bolton.HappyPetCare.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Integer>{

//	void deleteOwenerbyId(int ownerId);

}
