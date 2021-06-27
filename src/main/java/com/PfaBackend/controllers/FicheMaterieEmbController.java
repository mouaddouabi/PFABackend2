package com.PfaBackend.controllers;

import com.PfaBackend.beans.FicheMaterieEmb;
import com.PfaBackend.services.FicheMaterieEmbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class FicheMaterieEmbController {

    @Autowired
    private FicheMaterieEmbService fichematerieembService;

    @PostMapping("/fichematerieemb")
    public FicheMaterieEmb save(@RequestBody FicheMaterieEmb fichematerieemb){
        return fichematerieembService.save(fichematerieemb);
    }
    @PutMapping("/fichematerieemb/{id}")
    public FicheMaterieEmb update(@PathVariable(value = "id") Long id, @RequestBody FicheMaterieEmb ficheMaterieEmb){
        return fichematerieembService.update(id,ficheMaterieEmb);
    }
    @GetMapping("/fichematerieemb/{id}")
    public Optional<FicheMaterieEmb> getById(@PathVariable(value = "id") Long id){
        return fichematerieembService.find(id);
    }

    @GetMapping("/fichematerieemb")
    public List<FicheMaterieEmb> getAll(){
        return fichematerieembService.findAll();
    }

    @DeleteMapping("/fichematerieemb/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        fichematerieembService.delete(id);
    }

    @DeleteMapping("/fichematerieemb")
    public void deleteAll(){
        fichematerieembService.deleteAll();
    }

    @GetMapping("/fichematerieemb/count")
    public long count(){
        return fichematerieembService.count();
    }
}