package com.PfaBackend.controllers;

import com.PfaBackend.beans.Fournisseur;
import com.PfaBackend.services.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/fournisseurs")
public class FournisseurController {

    @Autowired
    private FournisseurService fournisseurService;

    @PostMapping("/fournisseur")
    public Fournisseur save(@RequestBody Fournisseur fournisseur){
        return fournisseurService.save(fournisseur);
    }

    @PutMapping("/fournisseur/{id}")
    public Fournisseur update(@PathVariable(value = "id") Long id,@RequestBody Fournisseur fournisseur) {
        return fournisseurService.update(id, fournisseur);
    }
    @GetMapping("/fournisseur/{id}")
    public Optional<Fournisseur> getById(@PathVariable(value = "id") Long id){
        return fournisseurService.find(id);
    }

    @GetMapping("/fournisseur")
    public List<Fournisseur> getAll(){
        return fournisseurService.findAll();
    }

    @DeleteMapping("/fournisseur/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        fournisseurService.delete(id);
    }

    @DeleteMapping("/fournisseur")
    public void deleteAll(){
        fournisseurService.deleteAll();
    }

    @GetMapping("/fournisseur/count")
    public long count(){
        return fournisseurService.count();
    }
}