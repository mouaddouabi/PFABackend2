package com.PfaBackend.controllers;

import com.PfaBackend.beans.Unites;
import com.PfaBackend.services.UnitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping()
public class UnitesController {

    @Autowired
    private UnitesService unitesService;

    @PostMapping("/unites")
    public Unites save(@RequestBody Unites unites){
        return unitesService.save(unites);
    }

    @GetMapping("/unites/{id}")
    public Optional<Unites> getById(@PathVariable(value = "id") Long id){
        return unitesService.find(id);
    }


    @PutMapping("/unites/{id}")
    public Unites getById(@PathVariable(value = "id") Long id,@RequestBody Unites unites){
        unites.setNumSerieUnitesInit(id);
        return unitesService.save(unites);
    }

    @GetMapping("/unites")
    public List<Unites> getAll(){
        return unitesService.findAll();
    }

    @DeleteMapping("/unites/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        unitesService.delete(id);
    }

    @DeleteMapping("/unites")
    public void deleteAll(){
        unitesService.deleteAll();
    }

    @GetMapping("/unites/count")
    public long count(){
        return unitesService.count();
    }
}