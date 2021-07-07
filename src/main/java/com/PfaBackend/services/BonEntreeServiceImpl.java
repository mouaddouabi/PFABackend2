package com.PfaBackend.services;

import com.PfaBackend.beans.BonEntree;
import com.PfaBackend.repositories.BonEntreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class BonEntreeServiceImpl implements BonEntreeService {

    @Autowired
    private BonEntreeRepository bonentreeRepository;

    @Override
    public BonEntree save(BonEntree bonentree) {
        return bonentreeRepository.save(bonentree);
    }

    @Override
    public Optional<BonEntree> find(Long id) {
        return bonentreeRepository.findById(id);
    }

    @Override
    public List<BonEntree> findAll() {
        return bonentreeRepository.findAll();
    }

    @Override
    public List<BonEntree> findAll(Sort sort){
        return bonentreeRepository.findAll(sort);
    }

    @Override
    public Page<BonEntree> findAll(Pageable pageable){
        return bonentreeRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    bonentreeRepository.deleteById(id);
    }

    @Override
    public void delete(BonEntree bonentree) {
        bonentreeRepository.delete(bonentree);
    }

    @Override
    public void deleteAll() {
        bonentreeRepository.deleteAll();
    }

    @Override
    public long count() {
        return bonentreeRepository.count();
    }

    @Override
    public BonEntree update(Long id, BonEntree bonentree) {
        bonentree.setNumBon(id);
        return bonentreeRepository.save(bonentree);
    }

    @Override
    public BonEntree findFicheByLot(Long id) {
        return bonentreeRepository.findFicheByLot(id);
    }

}