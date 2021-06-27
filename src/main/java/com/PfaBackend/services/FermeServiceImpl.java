package com.PfaBackend.services;

import com.PfaBackend.beans.Ferme;
import com.PfaBackend.beans.Fournisseur;
import com.PfaBackend.repositories.FermeRepository;
import com.PfaBackend.repositories.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class FermeServiceImpl implements FermeService {

    @Autowired
    private FermeRepository fermeRepository;
    @Autowired
    private FournisseurRepository fournisseurRepository ;
    @Override
    public Ferme save(Ferme ferme) {
        return fermeRepository.save(ferme);
    }

    @Override
    public Optional<Ferme> find(Long id) {
        return fermeRepository.findById(id);
    }

    @Override
    public List<Ferme> findAll() {
        return fermeRepository.findAll();
    }

    @Override
    public List<Ferme> findAll(Sort sort){
        return fermeRepository.findAll(sort);
    }

    @Override
    public Page<Ferme> findAll(Pageable pageable){
        return fermeRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    fermeRepository.deleteById(id);
    }

    @Override
    public void delete(Ferme ferme) {
        fermeRepository.delete(ferme);
    }

    @Override
    public void deleteAll() {
        fermeRepository.deleteAll();
    }

    @Override
    public long count() {
        return fermeRepository.count();
    }

    @Override
    public List<Ferme> findFermesFournisseur(Long id) {
        List<Ferme> res = fermeRepository.findFermesFournisseur(id);
        return res;
    }

    public Ferme ajouter(Ferme ferme) {
        Fournisseur fournisseur = fournisseurRepository.findFournisseurById(ferme.getFournisseur().getId());
        ferme.setFournisseur(fournisseur);
        return fermeRepository.save(ferme);
    }

    @Override
    public Ferme update(Long id, Ferme ferme) {
        ferme.setCodeFerme(id);
        return fermeRepository.save(ferme);
    }

}