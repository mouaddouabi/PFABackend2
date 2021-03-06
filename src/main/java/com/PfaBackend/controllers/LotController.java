package com.PfaBackend.controllers;

import com.PfaBackend.beans.Lot;
import com.PfaBackend.services.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class LotController {

    @Autowired
    private LotService lotService;

    @PostMapping("/lot")
    public Lot save(@RequestBody Lot lot){
        return lotService.save(lot);
    }

    @GetMapping("/lot/{id}")
    public Lot getById(@PathVariable(value = "id") Long id){
        return lotService.find(id);
    }


    @GetMapping("/lot")
    public List<Lot> getAll(){
        return lotService.findAll();
    }

    @GetMapping("/lot/fumnotcond")
    public List<Lot> getLotFumNotCond(){
        System.out.println(lotService.findLotFumNotCond());
        return lotService.findLotFumNotCond();
    }
    @GetMapping("/lot/fumnotcondmod/{id}")
    public List<Lot> getLotFumNotCondmod(@PathVariable(value = "id") Long id){
        System.out.println(lotService.findLotFumNotCondMod(id));
        return lotService.findLotFumNotCondMod(id);
    }
    @GetMapping("/lot/rec")
    public List<Lot> getAllrec(){
        return lotService.findAllRec();
    }

    //change
    @GetMapping("/lot/fum")
    public List<Lot> getAllfum(){
        return lotService.findAllFum();
    }
    /**************************************************/
    @GetMapping("/lot/fummod/{id}")
    public List<Lot> getLotFummod(@PathVariable(value = "id") Long id){
        return lotService.findLotFumMod(id);
    }
    /*****************************************************/
    @DeleteMapping("/lot/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        lotService.delete(id);
    }

    @DeleteMapping("/lot")
    public void deleteAll(){
        lotService.deleteAll();
    }

    @GetMapping("/lot/count")
    public long count(){
        return lotService.count();
    }
}