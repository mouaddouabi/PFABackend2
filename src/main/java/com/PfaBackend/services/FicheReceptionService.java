package com.PfaBackend.services;

import com.PfaBackend.beans.FicheReception;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface FicheReceptionService {

    FicheReception save(FicheReception fichereception);

    Optional<FicheReception> find(Long id);

    List<FicheReception> findAll();

    List<FicheReception> findAll(Sort sort);

    Page<FicheReception> findAll(Pageable pageable);

    void delete(Long id);

    void delete(FicheReception fichereception);

    void deleteAll();

    long count();

    FicheReception ajouter(FicheReception fichereception);

    FicheReception update(Long id, FicheReception fichereception);

    FicheReception findById(Long id);

    FicheReception findFicheByLot(Long id);
}