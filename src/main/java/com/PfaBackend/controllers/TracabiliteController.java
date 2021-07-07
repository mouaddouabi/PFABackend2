package com.PfaBackend.controllers;

import com.PfaBackend.beans.Tracabilite;
import com.PfaBackend.services.TracabiliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class TracabiliteController {

    @Autowired
    private TracabiliteService tracabiliteService;

    @PostMapping("/tracabilite")
    public Tracabilite save(@RequestBody Tracabilite tracabilite){
        return tracabiliteService.save(tracabilite);
    }

    @GetMapping("/tracabilite/{id}")
    public Optional<Tracabilite> getById(@PathVariable(value = "id") Long id){
        return tracabiliteService.find(id);
    }

    @GetMapping("/tracabilite")
    public List<Tracabilite> getAll(){
        return tracabiliteService.findAll();
    }

    @DeleteMapping("/tracabilite/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        tracabiliteService.delete(id);
    }

    @DeleteMapping("/tracabilite")
    public void deleteAll(){
        tracabiliteService.deleteAll();
    }

    @GetMapping("/tracabilite/count")
    public long count(){
        return tracabiliteService.count();
    }
}