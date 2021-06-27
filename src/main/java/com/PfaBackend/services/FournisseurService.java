package com.PfaBackend.services;

import com.PfaBackend.beans.Fournisseur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface FournisseurService {

    Fournisseur save(Fournisseur fournisseur);

    Optional<Fournisseur> find(Long id);

    List<Fournisseur> findAll();

    List<Fournisseur> findAll(Sort sort);

    Page<Fournisseur> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Fournisseur fournisseur);

    void deleteAll();

    long count();

    Fournisseur update(Long id, Fournisseur fournisseur);
}