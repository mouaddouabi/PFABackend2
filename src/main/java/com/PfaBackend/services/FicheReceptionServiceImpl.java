package com.PfaBackend.services;

import com.PfaBackend.beans.FicheReception;
import com.PfaBackend.beans.Lot;
import com.PfaBackend.beans.Parcelle;
import com.PfaBackend.repositories.FicheReceptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class FicheReceptionServiceImpl  implements FicheReceptionService {

    @Autowired
    private FicheReceptionRepository fichereceptionRepository;

    @Override
    public FicheReception save(FicheReception fichereception) {
        return fichereceptionRepository.save(fichereception);
    }

    @Override
    public Optional<FicheReception> find(Long id) {
        return fichereceptionRepository.findById(id);
    }

    @Override
    public List<FicheReception> findAll() {
        return fichereceptionRepository.findAll();
    }

    @Override
    public List<FicheReception> findAll(Sort sort){
        return fichereceptionRepository.findAll(sort);
    }

    @Override
    public Page<FicheReception> findAll(Pageable pageable){
        return fichereceptionRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    fichereceptionRepository.deleteById(id);
    }

    @Override
    public void delete(FicheReception fichereception) {
        fichereceptionRepository.delete(fichereception);
    }

    @Override
    public void deleteAll() {
        fichereceptionRepository.deleteAll();
    }

    @Override
    public long count() {
        return fichereceptionRepository.count();
    }

    @Override
    public FicheReception ajouter(FicheReception fichereception) {

        return null;
    }

    @Override
    public FicheReception update(Long id, FicheReception fichereception) {
        System.out.println(fichereception.getLot().getVariete());
        //fichereception.setCodeRecep(id);
        return fichereceptionRepository.save(fichereception);
    }

    @Override
    public FicheReception findById(Long id) {
        System.out.println(fichereceptionRepository.findFicheReceptionByCodeRecep(id).getResponsable());
        return fichereceptionRepository.findFicheReceptionByCodeRecep(id);
    }

    @Override
    public FicheReception findFicheByLot(Long id) {
        return fichereceptionRepository.findFicheByLot(id);
    }
    
}