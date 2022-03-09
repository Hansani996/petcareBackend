package com.bolton.HappyPetCare.controler;
import com.bolton.HappyPetCare.model.Pet;
import com.bolton.HappyPetCare.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/pet")
public class PetController {
	
	@Autowired
	private PetService petService;

	@GetMapping("/all")
	public ResponseEntity<List<Pet>> getAllPets(){
		List<Pet>ownrs= petService.findAllPets();
		return new ResponseEntity<>(ownrs , HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Pet>addOwner(@RequestBody Pet pet){
		Pet newOwner=petService.addPet(pet);
		return new ResponseEntity<>(newOwner, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Pet>updateOwner(@RequestBody Pet pet){
		Pet updateOwer =petService.updatePet(pet);
		return new ResponseEntity<>(updateOwer, HttpStatus.OK);
	}
	
}

