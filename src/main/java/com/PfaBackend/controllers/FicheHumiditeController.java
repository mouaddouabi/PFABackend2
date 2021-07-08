package com.PfaBackend.controllers;

import com.PfaBackend.beans.FicheHumidite;
import com.PfaBackend.services.FicheHumiditeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class FicheHumiditeController {


    @Autowired
    private FicheHumiditeService fichehumiditeService;

    @PostMapping("/fichehumidite")
    public FicheHumidite save(@RequestBody FicheHumidite fichehumidite){
        return fichehumiditeService.save(fichehumidite);
    }

    @GetMapping("/fichehumidite/{id}")
    public Optional<FicheHumidite> getById(@PathVariable(value = "id") Long id){
        return fichehumiditeService.find(id);
    }

    @PutMapping("/fichehumidite/{id}")
    public FicheHumidite update(@PathVariable(value = "id") Long id,@RequestBody FicheHumidite fichehumidite){
        return fichehumiditeService.update(id,fichehumidite);
    }


    @GetMapping("/fichehumidite")
    public List<FicheHumidite> getAll(){
        return fichehumiditeService.findAll();
    }
    @GetMapping("/fichehumidite/lot/{id}")
    public FicheHumidite findFicheByLot(@PathVariable(value = "id") Long id){
        return fichehumiditeService.findFicheByLot(id);
    }
    @DeleteMapping("/fichehumidite/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
    	fichehumiditeService.delete(id);
    }

    @DeleteMapping("/fichehumidite")
    public void deleteAll(){
    	fichehumiditeService.deleteAll();
    }

    @GetMapping("/fichehumidite/count")
    public long count(){
        return fichehumiditeService.count();
    }
}
