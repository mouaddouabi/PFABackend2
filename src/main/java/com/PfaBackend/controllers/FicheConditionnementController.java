package com.PfaBackend.controllers;

import com.PfaBackend.beans.FicheConditionnement;
import com.PfaBackend.services.FicheConditionnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class FicheConditionnementController {

    @Autowired
    private FicheConditionnementService ficheconditionnementService;

    @PostMapping("/ficheconditionnement")
    public FicheConditionnement save(@RequestBody FicheConditionnement ficheconditionnement){
        return ficheconditionnementService.save(ficheconditionnement);
    }

    @GetMapping("/ficheconditionnement/{id}")
    public Optional<FicheConditionnement> getById(@PathVariable(value = "id") Long id){
        return ficheconditionnementService.find(id);
    }

    @PutMapping("/ficheconditionnement/{id}")
    public FicheConditionnement update(@PathVariable(value = "id") Long id,@RequestBody FicheConditionnement ficheconditionnement){
        ficheconditionnement.setCodeCondi(id);
        return ficheconditionnementService.save(ficheconditionnement);
    }

    @GetMapping("/ficheconditionnement")
    public List<FicheConditionnement> getAll(){
        return ficheconditionnementService.findAll();
    }

    @DeleteMapping("/ficheconditionnement/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        ficheconditionnementService.delete(id);
    }

    @DeleteMapping("/ficheconditionnement")
    public void deleteAll(){
        ficheconditionnementService.deleteAll();
    }

    @GetMapping("/ficheconditionnement/count")
    public long count(){
        return ficheconditionnementService.count();
    }
}