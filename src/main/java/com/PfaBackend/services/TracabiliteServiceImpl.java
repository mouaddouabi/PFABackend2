package com.PfaBackend.services;

import com.PfaBackend.beans.Tracabilite;
import com.PfaBackend.repositories.TracabiliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class TracabiliteServiceImpl implements TracabiliteService {

    @Autowired
    private TracabiliteRepository tracabiliteRepository;

    @Override
    public Tracabilite save(Tracabilite tracabilite) {
        return tracabiliteRepository.save(tracabilite);
    }

    @Override
    public Optional<Tracabilite> find(Long id) {
        return tracabiliteRepository.findById(id);
    }

    @Override
    public List<Tracabilite> findAll() {
        return tracabiliteRepository.findAll();
    }

    @Override
    public List<Tracabilite> findAll(Sort sort){
        return tracabiliteRepository.findAll(sort);
    }

    @Override
    public Page<Tracabilite> findAll(Pageable pageable){
        return tracabiliteRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    tracabiliteRepository.deleteById(id);
    }

    @Override
    public void delete(Tracabilite tracabilite) {
        tracabiliteRepository.delete(tracabilite);
    }

    @Override
    public void deleteAll() {
        tracabiliteRepository.deleteAll();
    }

    @Override
    public long count() {
        return tracabiliteRepository.count();
    }

}