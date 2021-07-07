package com.PfaBackend.services;

import com.PfaBackend.beans.FicheConditionnement;
import com.PfaBackend.beans.Tracabilite;
import com.PfaBackend.repositories.FicheConditionnementRepository;
import com.PfaBackend.repositories.TracabiliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class FicheConditionnementServiceImpl implements FicheConditionnementService {

    @Autowired
    private FicheConditionnementRepository ficheconditionnementRepository;
    @Autowired
    private TracabiliteRepository tracabiliteRepository;
    @Override
    public FicheConditionnement save(FicheConditionnement ficheconditionnement) {
        Tracabilite tracabilite = new Tracabilite();
        String codeT = ficheconditionnement.getLot().getParcelle().getFerme().getCodeFerme()+""+ficheconditionnement.getLot().getCodeLot();
        System.out.println(codeT);
        tracabilite.setCodeTracabilite(Long.parseLong(codeT));
        tracabilite.setLot(ficheconditionnement.getLot());
        tracabiliteRepository.save(tracabilite);
        return ficheconditionnementRepository.save(ficheconditionnement);
    }

    @Override
    public Optional<FicheConditionnement> find(Long id) {
        return ficheconditionnementRepository.findById(id);
    }

    @Override
    public List<FicheConditionnement> findAll() {
        return ficheconditionnementRepository.findAll();
    }

    @Override
    public List<FicheConditionnement> findAll(Sort sort){
        return ficheconditionnementRepository.findAll(sort);
    }

    @Override
    public Page<FicheConditionnement> findAll(Pageable pageable){
        return ficheconditionnementRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {

        FicheConditionnement fiche = ficheconditionnementRepository.findFicheConditionnementByCodeCondi(id);
        Tracabilite tracabilite = tracabiliteRepository.findTracebyLot(fiche.getLot().getCodeLot());
        System.out.println("****************************");
        //System.out.println(tracabilite.getCodeTracabilite());
        //tracabiliteRepository.deleteTrace(tracabilite.getCodeTracabilite());
        ficheconditionnementRepository.deleteById(id);
        tracabiliteRepository.deleteById(tracabilite.getCodeTracabilite());
        System.out.println("****************************");
    }

    @Override
    public void delete(FicheConditionnement ficheconditionnement) {
        ficheconditionnementRepository.delete(ficheconditionnement);
    }

    @Override
    public void deleteAll() {
        ficheconditionnementRepository.deleteAll();
    }

    @Override
    public long count() {
        return ficheconditionnementRepository.count();
    }

    @Override
    public FicheConditionnement findFicheByLot(Long id) {
        return ficheconditionnementRepository.findFicheByLot(id);
    }

}