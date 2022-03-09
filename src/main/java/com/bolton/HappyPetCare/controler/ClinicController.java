package com.bolton.HappyPetCare.controler;

import com.bolton.HappyPetCare.model.Clinic;
import com.bolton.HappyPetCare.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clinic")
@CrossOrigin("*")
public class ClinicController {

    @Autowired
    private ClinicService clinicService;

    @GetMapping("/all")
    public ResponseEntity<List<Clinic>> getAll(){
        List<Clinic> ownrs= clinicService.findAllMedicalData();
        return new ResponseEntity<>(ownrs , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Clinic>add(@RequestBody Clinic clinic){
        Clinic newOwner=clinicService.create(clinic);
        return new ResponseEntity<>(newOwner, HttpStatus.CREATED);
    }

//    @PutMapping("/update")
//    public ResponseEntity<Owner>updateOwner(@RequestBody Owner owner){
//        Owner updateOwer =clinicService.updateOwner(owner);
//        return new ResponseEntity<>(updateOwer, HttpStatus.OK);
//    }
}
