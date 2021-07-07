package com.PfaBackend.services;

import com.PfaBackend.beans.Tracabilite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface TracabiliteService {

    Tracabilite save(Tracabilite tracabilite);

    Optional<Tracabilite> find(Long id);

    List<Tracabilite> findAll();

    List<Tracabilite> findAll(Sort sort);

    Page<Tracabilite> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Tracabilite tracabilite);

    void deleteAll();

    long count();

}