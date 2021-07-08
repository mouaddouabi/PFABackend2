package com.PfaBackend.services;

import com.PfaBackend.beans.FicheFumigation;
import com.PfaBackend.beans.Lot;
import com.PfaBackend.repositories.FicheFumigationRepository;
import com.PfaBackend.repositories.LotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FicheFumigationServiceImpl implements  FicheFumigationService{

    @Autowired
    private FicheFumigationRepository fichefumigationRepository;
    @Autowired
    private LotRepository lotRepository;
    @Override
    public FicheFumigation save(FicheFumigation fichefumigation) {
        Lot lot = lotRepository.save(fichefumigation.getLot());
        fichefumigation.setLot(lot);
        return fichefumigationRepository.save(fichefumigation);
    }

    @Override
    public Optional<FicheFumigation> find(Long id) {
        return fichefumigationRepository.findById(id);
    }

    @Override
    public List<FicheFumigation> findAll() {
        return fichefumigationRepository.findAll();
    }

    @Override
    public List<FicheFumigation> findAll(Sort sort){
        return fichefumigationRepository.findAll(sort);
    }

    @Override
    public Page<FicheFumigation> findAll(Pageable pageable){
        return fichefumigationRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    	fichefumigationRepository.deleteById(id);
    }

    @Override
    public void delete(FicheFumigation fichefumigation) {
    	fichefumigationRepository.delete(fichefumigation);
    }

    @Override
    public void deleteAll() {
    	fichefumigationRepository.deleteAll();
    }

    @Override
    public long count() {
        return fichefumigationRepository.count();
    }

    @Override
    public FicheFumigation update(Long id, FicheFumigation fichefumigation) {
        return fichefumigationRepository.save(fichefumigation);
    }

}
