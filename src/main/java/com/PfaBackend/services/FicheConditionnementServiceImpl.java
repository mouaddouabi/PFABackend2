package com.PfaBackend.services;

import com.PfaBackend.beans.FicheConditionnement;
import com.PfaBackend.repositories.FicheConditionnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class FicheConditionnementServiceImpl implements FicheConditionnementService {

    @Autowired
    private FicheConditionnementRepository ficheconditionnementRepository;

    @Override
    public FicheConditionnement save(FicheConditionnement ficheconditionnement) {
        return ficheconditionnementRepository.save(ficheconditionnement);
    }

    @Override
    public Optional<FicheConditionnement> find(Long id) {
        return ficheconditionnementRepository.findById(id);
    }

    @Override
    public List<FicheConditionnement> findAll() {
        return ficheconditionnementRepository.findAll();
    }

    @Override
    public List<FicheConditionnement> findAll(Sort sort){
        return ficheconditionnementRepository.findAll(sort);
    }

    @Override
    public Page<FicheConditionnement> findAll(Pageable pageable){
        return ficheconditionnementRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    ficheconditionnementRepository.deleteById(id);
    }

    @Override
    public void delete(FicheConditionnement ficheconditionnement) {
        ficheconditionnementRepository.delete(ficheconditionnement);
    }

    @Override
    public void deleteAll() {
        ficheconditionnementRepository.deleteAll();
    }

    @Override
    public long count() {
        return ficheconditionnementRepository.count();
    }

}