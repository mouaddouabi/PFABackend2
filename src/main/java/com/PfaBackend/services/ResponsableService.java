package com.PfaBackend.services;

import com.PfaBackend.beans.Responsable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ResponsableService {

    Responsable save(Responsable responsable);

    Optional<Responsable> find(Long id);

    List<Responsable> findAll();

    List<Responsable> findAll(Sort sort);

    Page<Responsable> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Responsable responsable);

    void deleteAll();

    long count();

    Responsable update(Responsable responsable, Long id);

    List<Responsable> findByFonct(String metier);
}