package com.PfaBackend.services;

import com.PfaBackend.beans.Ferme;
import com.PfaBackend.beans.Fournisseur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface FermeService {

    Ferme save(Ferme ferme);

    Optional<Ferme> find(Long id);

    List<Ferme> findAll();

    List<Ferme> findAll(Sort sort);

    Page<Ferme> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Ferme ferme);

    void deleteAll();

    long count();

    List<Ferme> findFermesFournisseur(Long id);

    Ferme ajouter(Ferme ferme);

    Ferme update(Long id, Ferme ferme);
}