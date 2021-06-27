package com.PfaBackend.controllers;

import com.PfaBackend.beans.BonEntree;
import com.PfaBackend.services.BonEntreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class BonEntreeController {

    @Autowired
    private BonEntreeService bonentreeService;

    @PostMapping("/bonentree")
    public BonEntree save(@RequestBody BonEntree bonentree){
        return bonentreeService.save(bonentree);
    }

    @GetMapping("/bonentree/{id}")
    public Optional<BonEntree> getById(@PathVariable(value = "id") Long id){
        return bonentreeService.find(id);
    }

    @PutMapping("/bonentree/{id}")
    public BonEntree update(@PathVariable(value = "id") Long id,@RequestBody BonEntree bonentree){
        return bonentreeService.update(id,bonentree);
    }


    @GetMapping("/bonentree")
    public List<BonEntree> getAll(){
        return bonentreeService.findAll();
    }

    @DeleteMapping("/bonentree/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        bonentreeService.delete(id);
    }

    @DeleteMapping("/bonentree")
    public void deleteAll(){
        bonentreeService.deleteAll();
    }

    @GetMapping("/bonentree/count")
    public long count(){
        return bonentreeService.count();
    }
}