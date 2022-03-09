package com.bolton.HappyPetCare.controler;

import com.bolton.HappyPetCare.model.Vaterinarian;
import com.bolton.HappyPetCare.service.VaterinarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vaterinarian")
@CrossOrigin("*")
public class VaterinarianController {


    @Autowired
    private VaterinarianService vaterinarianService;

    @GetMapping("/all")
    public ResponseEntity<List<Vaterinarian>> getAll(){
        List<Vaterinarian> ownrs= vaterinarianService.findAllVaterinarian();
        return new ResponseEntity<>(ownrs , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Vaterinarian>add(@RequestBody Vaterinarian vaterinarian){
        Vaterinarian newOwner=vaterinarianService.create(vaterinarian);
        return new ResponseEntity<>(newOwner, HttpStatus.CREATED);
    }
}
