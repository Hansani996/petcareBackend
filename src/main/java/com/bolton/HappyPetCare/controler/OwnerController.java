package com.bolton.HappyPetCare.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolton.HappyPetCare.model.Owner;
import com.bolton.HappyPetCare.repository.OwnerRepository;
import com.bolton.HappyPetCare.service.OwnerService;

@RestController
@RequestMapping("/owner")
public class OwnerController {
	
	private final OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		this.ownerService=ownerService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Owner>>getAllOwners(){
		List<Owner>ownrs= ownerService.findAllOwners();
		return new ResponseEntity<>(ownrs , HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Owner>addOwner(@RequestBody Owner owner){
		Owner newOwner=ownerService.addOwner(owner);
		return new ResponseEntity<>(newOwner, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Owner>updateOwner(@RequestBody Owner owner){
		Owner updateOwer =ownerService.updateOwner(owner);
		return new ResponseEntity<>(updateOwer, HttpStatus.OK);
	}
//	 
//	
//	@DeleteMapping("/delete/{ownerId}")
//	public ResponseEntity<?>deleteOwner(@PathVariable("ownerId") int ownerId){
//		ownerService.deleteOwenr(ownerId);
//		return new ResponseEntity<>(HttpStatus.OK);
//	}

}
