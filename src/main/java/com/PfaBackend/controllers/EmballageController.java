package com.PfaBackend.controllers;

import com.PfaBackend.beans.Emballage;
import com.PfaBackend.services.EmballageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class EmballageController {

    @Autowired
    private EmballageService emballageService;

    @PostMapping("/emballage")
    public Emballage save(@RequestBody Emballage emballage){
        return emballageService.save(emballage);
    }

    @GetMapping("/emballage/{id}")
    public Optional<Emballage> getById(@PathVariable(value = "id") Long id){
        return emballageService.find(id);
    }

    @PutMapping("/emballage/{id}")
    public Emballage update(@PathVariable(value = "id") Long id,@RequestBody Emballage emballage){
        return emballageService.update(emballage,id);
    }


    @GetMapping("/emballage")
    public List<Emballage> getAll(){
        return emballageService.findAll();
    }
    @GetMapping("/emballage/fiche/{id}")
    public List<Emballage> findEmballagesFiche(@PathVariable(value = "id") Long id){
        return emballageService.findEmballagesFiche(id);
    }

    @GetMapping("/emballage/notCond")
    public List<Emballage> getAllnotCond(){
        return emballageService.findnotCond();
    }

    @DeleteMapping("/emballage/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        emballageService.delete(id);
    }

    @DeleteMapping("/emballage")
    public void deleteAll(){
        emballageService.deleteAll();
    }

    @GetMapping("/emballage/count")
    public long count(){
        return emballageService.count();
    }
}