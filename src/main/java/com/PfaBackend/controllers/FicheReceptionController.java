package com.PfaBackend.controllers;

import com.PfaBackend.beans.FicheReception;
import com.PfaBackend.services.FicheReceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class FicheReceptionController {

    @Autowired
    private FicheReceptionService fichereceptionService;

    @PostMapping("/fichereception")
    public FicheReception save(@RequestBody FicheReception fichereception){
        return fichereceptionService.save(fichereception);
    }
    @PutMapping("/fichereception/{id}")
    public FicheReception update(@PathVariable(value = "id") Long id,@RequestBody FicheReception fichereception){
        FicheReception rec= fichereceptionService.update(id,fichereception);
        System.out.println(rec.getLot().getVariete());
        return rec;
    }
    @GetMapping("/fichereception/{id}")
    public FicheReception getById(@PathVariable(value = "id") Long id){
        return fichereceptionService.findById(id);
    }
    @GetMapping("/fichereception/lot/{id}")
    public FicheReception findFicheByLot(@PathVariable(value = "id") Long id){
        return fichereceptionService.findFicheByLot(id);
    }

    @GetMapping("/fichereception")
    public List<FicheReception> getAll(){
        return fichereceptionService.findAll();
    }

    @DeleteMapping("/fichereception/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        fichereceptionService.delete(id);
    }

    @DeleteMapping("/fichereception")
    public void deleteAll(){
        fichereceptionService.deleteAll();
    }

    @GetMapping("/fichereception/count")
    public long count(){
        return fichereceptionService.count();
    }
}