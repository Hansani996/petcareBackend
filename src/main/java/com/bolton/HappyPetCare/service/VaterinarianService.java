package com.bolton.HappyPetCare.service;

import com.bolton.HappyPetCare.model.Vaterinarian;
import com.bolton.HappyPetCare.repository.VaterinarianRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaterinarianService {

    @Autowired
    private VaterinarianRepo vaterinarianRepo;

        public Vaterinarian create(Vaterinarian vaterinarian){
            return vaterinarianRepo.save(vaterinarian);
        }

    public List<Vaterinarian> findAllVaterinarian(){
        return vaterinarianRepo.findAll();
    }

}
