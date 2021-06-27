package com.PfaBackend.services;

import com.PfaBackend.beans.Responsable;
import com.PfaBackend.repositories.ResponsableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class ResponsableServiceImpl implements ResponsableService {

    @Autowired
    private ResponsableRepository responsableRepository;

    @Override
    public Responsable save(Responsable responsable) {
        return responsableRepository.save(responsable);
    }

    @Override
    public Optional<Responsable> find(Long id) {
        return responsableRepository.findById(id);
    }

    @Override
    public List<Responsable> findAll() {
        return responsableRepository.findAll();
    }

    @Override
    public List<Responsable> findAll(Sort sort){
        return responsableRepository.findAll(sort);
    }

    @Override
    public Page<Responsable> findAll(Pageable pageable){
        return responsableRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    responsableRepository.deleteById(id);
    }

    @Override
    public void delete(Responsable responsable) {
        responsableRepository.delete(responsable);
    }

    @Override
    public void deleteAll() {
        responsableRepository.deleteAll();
    }

    @Override
    public long count() {
        return responsableRepository.count();
    }

    @Override
    public Responsable update(Responsable responsable, Long id) {
        responsable.setId(id);
        return responsableRepository.save(responsable);
    }

    @Override
    public List<Responsable> findByFonct(String metier) {
        return responsableRepository.findResponsableByFonctionRespo(metier);
    }

}