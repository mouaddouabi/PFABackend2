package com.PfaBackend.services;

import com.PfaBackend.beans.FicheMaterieEmb;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface FicheMaterieEmbService {

    FicheMaterieEmb save(FicheMaterieEmb fichematerieemb);

    Optional<FicheMaterieEmb> find(Long id);

    List<FicheMaterieEmb> findAll();

    List<FicheMaterieEmb> findAll(Sort sort);

    Page<FicheMaterieEmb> findAll(Pageable pageable);

    void delete(Long id);

    void delete(FicheMaterieEmb fichematerieemb);

    void deleteAll();

    long count();

    FicheMaterieEmb update(Long id, FicheMaterieEmb ficheMaterieEmb);
}