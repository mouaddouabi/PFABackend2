package com.PfaBackend.services;

import com.PfaBackend.beans.Lot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface LotService {

    Lot save(Lot lot);

    Lot update(Long id,Lot lot);
    Lot find(Long id);

    List<Lot> findAll();

    List<Lot> findAll(Sort sort);

    Page<Lot> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Lot lot);

    void deleteAll();

    long count();
    List<Lot> findAllRec();
    Lot updatelot(Long id,Lot lot);

    List<Lot> findLotFumNotCond();
    public List<Lot> findLotFumNotCondMod(Long id);
    }