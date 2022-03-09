package com.bolton.HappyPetCare.controler;

import com.bolton.HappyPetCare.model.Vaccination;
import com.bolton.HappyPetCare.service.VaccinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vaccination")
@CrossOrigin("*")
public class VaccinationController {

    @Autowired
        private VaccinationService vaccinationService;

    @GetMapping("/all")
    public ResponseEntity<List<Vaccination>> getAll(){
        List<Vaccination> ownrs= vaccinationService.findAllVaccinations();
        return new ResponseEntity<>(ownrs , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Vaccination>add(@RequestBody Vaccination vaccination){
        Vaccination newOwner=vaccinationService.create(vaccination);
        return new ResponseEntity<>(newOwner, HttpStatus.CREATED);
    }
}
