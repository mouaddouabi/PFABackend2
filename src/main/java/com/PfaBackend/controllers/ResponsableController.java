package com.PfaBackend.controllers;

import com.PfaBackend.beans.Responsable;
import com.PfaBackend.services.ResponsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class ResponsableController {

    @Autowired
    private ResponsableService responsableService;

    @PostMapping("/responsable")
    public Responsable save(@RequestBody Responsable responsable){
        return responsableService.save(responsable);
    }

    @GetMapping("/responsable/{id}")
    public Optional<Responsable> getById(@PathVariable(value = "id") Long id){
        return responsableService.find(id);
    }

    @GetMapping("/responsable/metier/{metier}")
    public List<Responsable> getBymetier(@PathVariable(value = "metier") String metier){
        return responsableService.findByFonct(metier);
    }

    @PutMapping("/responsable/{id}")
    public Responsable update(@RequestBody Responsable responsable,@PathVariable(value = "id") Long id){
        return responsableService.update(responsable,id);
    }

    @GetMapping("/responsable")
    public List<Responsable> getAll(){
        return responsableService.findAll();
    }

    @DeleteMapping("/responsable/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        responsableService.delete(id);
    }

    @DeleteMapping("/responsable")
    public void deleteAll(){
        responsableService.deleteAll();
    }

    @GetMapping("/responsable/count")
    public long count(){
        return responsableService.count();
    }
}