
package com.PfaBackend.services;

import com.PfaBackend.beans.FicheReception;
import com.PfaBackend.beans.Fournisseur;
import com.PfaBackend.beans.Lot;
import com.PfaBackend.beans.Transport;
import com.PfaBackend.repositories.FournisseurRepository;
import com.PfaBackend.repositories.LotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

@Service
public class LotServiceImpl implements LotService {

    @Autowired
    private LotRepository lotRepository;
    @Autowired
    FournisseurRepository fournisseurRepository;
    @Override
    public Lot save(Lot lot) {
        return lotRepository.save(lot);
    }

    @Override
    public Lot update(Long id, Lot lot) {
        lot.setCodeLot(id);
        return lotRepository.save(lot);
    }

    @Override
    public Lot find(Long id) {
        return lotRepository.findLotByCodeLot(id);
    }

    @Override
    public List<Lot> findAll() {
        return lotRepository.findAll();
    }

    @Override
    public List<Lot> findAll(Sort sort){
        return lotRepository.findAll(sort);
    }

    @Override
    public Page<Lot> findAll(Pageable pageable){
        return lotRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
        lotRepository.deleteById(id);
    }

    @Override
    public void delete(Lot lot) {
        lotRepository.delete(lot);
    }

    @Override
    public void deleteAll() {
        lotRepository.deleteAll();
    }

    @Override
    public long count() {
        return lotRepository.count();
    }


    public List<Lot> findAllRec(){
        List<Lot> lots = lotRepository.findAll();
        List<Lot> res = new ArrayList<>();
        for(Lot l:lots){
            if(l.getFicheReception()!=null && l.getBonEntree()==null){
                res.add(l);
            }
        }
        System.out.println(res);
        return res;
    }

    @Override
    public Lot updatelot(Long id, Lot lot) {
        lot.setCodeLot(id);
        return lotRepository.save(lot);
    }

    @Override
    public List<Lot> findLotFumNotCond() {
        List<Lot> all = lotRepository.findAll();
        List<Lot> res = new ArrayList<>();
        for(Lot lot:all){
            if(lot.getFicheFumigation()!=null && lot.getFicheConditionnement()==null){
                res.add(lot);
            }
        }
        return res;
    }

}