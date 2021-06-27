package com.PfaBackend.services;

import com.PfaBackend.beans.Emballage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface EmballageService {

    Emballage save(Emballage emballage);

    Optional<Emballage> find(Long id);

    List<Emballage> findAll();

    List<Emballage> findAll(Sort sort);

    Page<Emballage> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Emballage emballage);

    void deleteAll();

    long count();
    public Emballage update(Emballage emballage,Long id);

    List<Emballage> findnotCond();

    List<Emballage> findEmballagesFiche(Long id);
}