package com.PfaBackend.controllers;


import com.PfaBackend.beans.FicheFumigation;
import com.PfaBackend.services.FicheFumigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class FicheFumigationController {


    @Autowired
    private FicheFumigationService fichefumigationService;

    @PostMapping("/fichefumigation")
    public FicheFumigation save(@RequestBody FicheFumigation  fichefumigation){
        return fichefumigationService.save(fichefumigation);
    }

    @GetMapping("/fichefumigation/{id}")
    public Optional<FicheFumigation> getById(@PathVariable(value = "id") Long id){
        return fichefumigationService.find(id);
    }

    @PutMapping("/fichefumigation/{id}")
    public FicheFumigation update(@PathVariable(value = "id") Long id,@RequestBody FicheFumigation fichefumigation){
        return fichefumigationService.update(id,fichefumigation);
    }


    @GetMapping("/fichefumigation")
    public List<FicheFumigation> getAll(){
        return fichefumigationService.findAll();
    }

    @DeleteMapping("/fichefumigation/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
    	fichefumigationService.delete(id);
    }

    @DeleteMapping("/fichefumigation")
    public void deleteAll(){
    	fichefumigationService.deleteAll();
    }

    @GetMapping("/fichefumigation/count")
    public long count(){
        return fichefumigationService.count();
    }

}
