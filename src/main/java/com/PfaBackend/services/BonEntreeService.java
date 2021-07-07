package com.PfaBackend.services;

import com.PfaBackend.beans.BonEntree;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface BonEntreeService {

    BonEntree save(BonEntree bonentree);

    Optional<BonEntree> find(Long id);

    List<BonEntree> findAll();

    List<BonEntree> findAll(Sort sort);

    Page<BonEntree> findAll(Pageable pageable);

    void delete(Long id);

    void delete(BonEntree bonentree);

    void deleteAll();

    long count();

    BonEntree update(Long id, BonEntree bonentree);

    BonEntree findFicheByLot(Long id);
}