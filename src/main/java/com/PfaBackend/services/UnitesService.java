package com.PfaBackend.services;

import com.PfaBackend.beans.Unites;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface UnitesService {

    Unites save(Unites unites);

    Optional<Unites> find(Long id);

    List<Unites> findAll();

    List<Unites> findAll(Sort sort);

    Page<Unites> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Unites unites);

    void deleteAll();

    long count();

}