package com.PfaBackend.controllers;

import com.PfaBackend.beans.Operateurs;
import com.PfaBackend.services.OperateursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class OperateursController {

    @Autowired
    private OperateursService operateursService;

    @PostMapping("/operateurs")
    public Operateurs save(@RequestBody Operateurs operateurs){
        return operateursService.save(operateurs);
    }

    @GetMapping("/operateurs/{id}")
    public Optional<Operateurs> getById(@PathVariable(value = "id") Long id){
        return operateursService.find(id);
    }

    @PutMapping("/operateurs/{id}")
    public Operateurs update(@PathVariable(value = "id") Long id,@RequestBody Operateurs operateurs){
        operateurs.setId(id);
        return operateursService.save(operateurs);
    }

    @GetMapping("/operateurs")
    public List<Operateurs> getAll(){
        return operateursService.findAll();
    }

    @GetMapping("/operateurs/type/{type}")
    public List<Operateurs> getBYType(@PathVariable(value = "type") String type){
        return operateursService.findByType(type);
    }

    @DeleteMapping("/operateurs/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        operateursService.delete(id);
    }

    @DeleteMapping("/operateurs")
    public void deleteAll(){
        operateursService.deleteAll();
    }

    @GetMapping("/operateurs/count")
    public long count(){
        return operateursService.count();
    }

}