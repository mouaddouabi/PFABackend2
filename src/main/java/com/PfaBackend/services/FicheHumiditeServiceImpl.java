package com.PfaBackend.services;

import com.PfaBackend.beans.FicheHumidite;
import com.PfaBackend.repositories.FicheHumiditeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FicheHumiditeServiceImpl implements  FicheHumiditeService {


    @Autowired
    private FicheHumiditeRepository fichehumiditeRepository;

    @Override
    public FicheHumidite save(FicheHumidite fichehumidite) {
        System.out.println("*********************");
        System.out.println(fichehumidite.getLot());
        System.out.println("*********************");
        return fichehumiditeRepository.save(fichehumidite);
    }

    @Override
    public Optional<FicheHumidite> find(Long id) {
        return fichehumiditeRepository.findById(id);
    }

    @Override
    public List<FicheHumidite> findAll() {
        return fichehumiditeRepository.findAll();
    }

    @Override
    public List<FicheHumidite> findAll(Sort sort){
        return fichehumiditeRepository.findAll(sort);
    }

    @Override
    public Page<FicheHumidite> findAll(Pageable pageable){
        return fichehumiditeRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    	fichehumiditeRepository.deleteById(id);
    }

    @Override
    public void delete(FicheHumidite fichehumidite) {
    	fichehumiditeRepository.delete(fichehumidite);
    }

    @Override
    public void deleteAll() {
    	fichehumiditeRepository.deleteAll();
    }

    @Override
    public long count() {
        return fichehumiditeRepository.count();
    }

    @Override
    public FicheHumidite update(Long id, FicheHumidite fichehumidite) {
        return fichehumiditeRepository.save(fichehumidite);
    }
    @Override
    public FicheHumidite findFicheByLot(Long id) {
        return fichehumiditeRepository.findFicheByLot(id);
    }
    
}
