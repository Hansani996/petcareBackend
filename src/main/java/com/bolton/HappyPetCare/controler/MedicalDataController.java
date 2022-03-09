package com.bolton.HappyPetCare.controler;

import com.bolton.HappyPetCare.model.MedicalData;
import com.bolton.HappyPetCare.service.MedicalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicalData")
@CrossOrigin("*")
public class MedicalDataController {

    @Autowired
    private MedicalDataService medicalDataService;

    @GetMapping("/all")
    public ResponseEntity<List<MedicalData>> getAll(){
        List<MedicalData> ownrs= medicalDataService.findAllMedicalData();
        return new ResponseEntity<>(ownrs , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<MedicalData>add(@RequestBody MedicalData medicalData){
        MedicalData newOwner=medicalDataService.create(medicalData);
        return new ResponseEntity<>(newOwner, HttpStatus.CREATED);
    }
}
