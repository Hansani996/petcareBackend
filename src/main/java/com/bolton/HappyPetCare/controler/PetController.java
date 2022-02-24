package com.bolton.HappyPetCare.controler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolton.HappyPetCare.repository.PetRepository;

@RestController
@RequestMapping("api/v1")
public class PetController {
	
	@Autowired
	private PetRepository petRepository;
	
}
