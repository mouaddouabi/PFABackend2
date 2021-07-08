package com.PfaBackend.services;

import com.PfaBackend.beans.FicheHumidite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface FicheHumiditeService {

	FicheHumidite save(FicheHumidite fichehumidite);

    Optional<FicheHumidite> find(Long id);

    List<FicheHumidite> findAll();

    List<FicheHumidite> findAll(Sort sort);

    Page<FicheHumidite> findAll(Pageable pageable);

    void delete(Long id);

    void delete(FicheHumidite fichehumidite);

    void deleteAll();

    long count();

    FicheHumidite update(Long id, FicheHumidite fichehumidite);
    FicheHumidite findFicheByLot(Long id);


}
