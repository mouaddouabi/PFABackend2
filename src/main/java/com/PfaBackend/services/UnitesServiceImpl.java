package com.PfaBackend.services;

import com.PfaBackend.beans.Unites;
import com.PfaBackend.repositories.UnitesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class UnitesServiceImpl implements UnitesService {

    @Autowired
    private UnitesRepository unitesRepository;

    @Override
    public Unites save(Unites unites) {
        return unitesRepository.save(unites);
    }

    @Override
    public Optional<Unites> find(Long id) {
        return unitesRepository.findById(id);
    }

    @Override
    public List<Unites> findAll() {
        return unitesRepository.findAll();
    }

    @Override
    public List<Unites> findAll(Sort sort){
        return unitesRepository.findAll(sort);
    }

    @Override
    public Page<Unites> findAll(Pageable pageable){
        return unitesRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    unitesRepository.deleteById(id);
    }

    @Override
    public void delete(Unites unites) {
        unitesRepository.delete(unites);
    }

    @Override
    public void deleteAll() {
        unitesRepository.deleteAll();
    }

    @Override
    public long count() {
        return unitesRepository.count();
    }

}