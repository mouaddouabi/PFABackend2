package com.PfaBackend.services;

import com.PfaBackend.beans.Fournisseur;
import com.PfaBackend.repositories.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class FournisseurServiceImpl implements FournisseurService {

    @Autowired
    private FournisseurRepository fournisseurRepository;

    @Override
    public Fournisseur save(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public Optional<Fournisseur> find(Long id) {
        return fournisseurRepository.findById(id);
    }

    @Override
    public List<Fournisseur> findAll() {
        return fournisseurRepository.findAll();
    }

    @Override
    public List<Fournisseur> findAll(Sort sort){
        return fournisseurRepository.findAll(sort);
    }

    @Override
    public Page<Fournisseur> findAll(Pageable pageable){
        return fournisseurRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    fournisseurRepository.deleteById(id);
    }

    @Override
    public void delete(Fournisseur fournisseur) {
        fournisseurRepository.delete(fournisseur);
    }

    @Override
    public void deleteAll() {
        fournisseurRepository.deleteAll();
    }

    @Override
    public long count() {
        return fournisseurRepository.count();
    }

    @Override
    public Fournisseur update(Long id,Fournisseur fournisseur) {
        fournisseur.setId(id);
        return fournisseurRepository.save(fournisseur);
    }


}