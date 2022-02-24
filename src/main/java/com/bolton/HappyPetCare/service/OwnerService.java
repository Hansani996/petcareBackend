package com.bolton.HappyPetCare.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolton.HappyPetCare.model.Owner;
import com.bolton.HappyPetCare.repository.OwnerRepository;

@Service
public class OwnerService {
	
	private final OwnerRepository ownerRepository;
	
	@Autowired
	public  OwnerService(OwnerRepository ownerRepository) {
		this.ownerRepository=ownerRepository;
		
	}
	
	public List<Owner> findAllOwners(){
		return ownerRepository.findAll();
	}
	
	public Owner addOwner(Owner owner){
		owner.setOwnerId(UUID.randomUUID().toString());
		return ownerRepository.save(owner);
	}

	public Owner updateOwner(Owner owner) {
		return ownerRepository.save(owner);
	}
//	
//	public void deleteOwenr(int ownerId) {
//		ownerRepository.deleteOwenerbyId(ownerId);
//	}
	

}
