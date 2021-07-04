package com.PfaBackend.services;

import com.PfaBackend.beans.Operateurs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface OperateursService {

    Operateurs save(Operateurs operateurs);

    Optional<Operateurs> find(Long id);

    List<Operateurs> findAll();

    List<Operateurs> findAll(Sort sort);

    Page<Operateurs> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Operateurs operateurs);

    void deleteAll();

    long count();

    List<Operateurs> findByType(String type);
}