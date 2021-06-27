package com.PfaBackend.services;

import com.PfaBackend.beans.Emballage;
import com.PfaBackend.repositories.EmballageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmballageServiceImpl implements EmballageService {

    @Autowired
    private EmballageRepository emballageRepository;

    @Override
    public Emballage save(Emballage emballage) {
        return emballageRepository.save(emballage);
    }

    @Override
    public Optional<Emballage> find(Long id) {
        return emballageRepository.findById(id);
    }

    @Override
    public List<Emballage> findAll() {
        return emballageRepository.findAll();
    }

    @Override
    public List<Emballage> findAll(Sort sort){
        return emballageRepository.findAll(sort);
    }

    @Override
    public Page<Emballage> findAll(Pageable pageable){
        return emballageRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    emballageRepository.deleteById(id);
    }

    @Override
    public void delete(Emballage emballage) {
        emballageRepository.delete(emballage);
    }

    @Override
    public void deleteAll() {
        emballageRepository.deleteAll();
    }

    @Override
    public long count() {
        return emballageRepository.count();
    }

    @Override
    public Emballage update(Emballage emballage, Long id) {
        emballage.setCodeEmb(id);
        return emballageRepository.save(emballage);
    }

    @Override
    public List<Emballage> findnotCond() {
        List<Emballage> emballages = emballageRepository.findAll();
        List<Emballage> res = new ArrayList<>();
        for(Emballage e:emballages){
            if(e.getFicheConditionnement()==null){
                res.add(e);
            }
        }
        return res;
    }

    @Override
    public List<Emballage> findEmballagesFiche(Long id) {
        return emballageRepository.findEmballagesFiche(id);
    }

}