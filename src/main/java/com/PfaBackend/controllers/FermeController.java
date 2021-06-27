package com.PfaBackend.controllers;

import com.PfaBackend.beans.Ferme;
import com.PfaBackend.beans.Fournisseur;
import com.PfaBackend.services.FermeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class FermeController {

    @Autowired
    private FermeService fermeService;

    @PostMapping("/ferme")
    public Ferme save(@RequestBody Ferme ferme){
        return fermeService.ajouter (ferme);
    }

    @GetMapping("/ferme/{id}")
    public Optional<Ferme> getById(@PathVariable(value = "id") Long id){
        return fermeService.find(id);
    }

    @PutMapping("/ferme/{id}")
    public Ferme update(@PathVariable(value = "id") Long id,@RequestBody Ferme ferme){
        return fermeService.update(id,ferme);
    }


    @GetMapping("/ferme/fournisseur/{id}")
    public List<Ferme> findFermesFournisseur(@PathVariable(value = "id") Long id){
        return fermeService.findFermesFournisseur(id);
    }

    @GetMapping("/ferme")
    public List<Ferme> getAll(){
        return fermeService.findAll();
    }

    @DeleteMapping("/ferme/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        fermeService.delete(id);
    }

    @DeleteMapping("/ferme")
    public void deleteAll(){
        fermeService.deleteAll();
    }

    @GetMapping("/ferme/count")
    public long count(){
        return fermeService.count();
    }
}