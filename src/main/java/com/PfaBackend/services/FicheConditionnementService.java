package com.PfaBackend.services;

import com.PfaBackend.beans.FicheConditionnement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface FicheConditionnementService {

    FicheConditionnement save(FicheConditionnement ficheconditionnement);

    Optional<FicheConditionnement> find(Long id);

    List<FicheConditionnement> findAll();

    List<FicheConditionnement> findAll(Sort sort);

    Page<FicheConditionnement> findAll(Pageable pageable);

    void delete(Long id);

    void delete(FicheConditionnement ficheconditionnement);

    void deleteAll();

    long count();

}