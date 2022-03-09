package com.bolton.HappyPetCare.controler;

import com.bolton.HappyPetCare.model.Doctor;
import com.bolton.HappyPetCare.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
@CrossOrigin("*")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/all")
    public ResponseEntity<List<Doctor>> getAll(){
        List<Doctor> ownrs= doctorService.findAllMedicalData();
        return new ResponseEntity<>(ownrs , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Doctor>add(@RequestBody Doctor doctor){
        Doctor newOwner=doctorService.create(doctor);
        return new ResponseEntity<>(newOwner, HttpStatus.CREATED);
    }
}
