package com.PfaBackend.services;

import com.PfaBackend.beans.Operateurs;
import com.PfaBackend.repositories.OperateursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class OperateursServiceImpl implements OperateursService {

    @Autowired
    private OperateursRepository operateursRepository;

    @Override
    public Operateurs save(Operateurs operateurs) {
        return operateursRepository.save(operateurs);
    }

    @Override
    public Optional<Operateurs> find(Long id) {
        return operateursRepository.findById(id);
    }

    @Override
    public List<Operateurs> findAll() {
        return operateursRepository.findAll();
    }

    @Override
    public List<Operateurs> findAll(Sort sort){
        return operateursRepository.findAll(sort);
    }

    @Override
    public Page<Operateurs> findAll(Pageable pageable){
        return operateursRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    operateursRepository.deleteById(id);
    }

    @Override
    public void delete(Operateurs operateurs) {
        operateursRepository.delete(operateurs);
    }

    @Override
    public void deleteAll() {
        operateursRepository.deleteAll();
    }

    @Override
    public long count() {
        return operateursRepository.count();
    }

    @Override
    public List<Operateurs> findByType(String type) {
        return operateursRepository.findOperateursByOperation(type);
    }

}