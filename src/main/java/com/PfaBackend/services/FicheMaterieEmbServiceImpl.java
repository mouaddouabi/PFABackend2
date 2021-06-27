package com.PfaBackend.services;

import com.PfaBackend.beans.Emballage;
import com.PfaBackend.beans.FicheMaterieEmb;
import com.PfaBackend.beans.Responsable;
import com.PfaBackend.repositories.EmballageRepository;
import com.PfaBackend.repositories.FicheMaterieEmbRepository;
import com.PfaBackend.repositories.ResponsableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class FicheMaterieEmbServiceImpl implements FicheMaterieEmbService {

    @Autowired
    private FicheMaterieEmbRepository fichematerieembRepository;
    @Autowired
    private ResponsableRepository responsableRepository;
    @Autowired
    EmballageRepository emballageRepository;
    @Autowired
    EmballageService emballageService;
    @Autowired
    ResponsableService responsableService;
    @Override
    public FicheMaterieEmb save(FicheMaterieEmb fichematerieemb) {

        FicheMaterieEmb ficheMaterieEmb2 = new FicheMaterieEmb();
        ficheMaterieEmb2.setCodeEmbg(fichematerieemb.getCodeEmbg());
        ficheMaterieEmb2.setDate(fichematerieemb.getDate());
        ficheMaterieEmb2.setResponsable(fichematerieemb.getResponsable());
        FicheMaterieEmb fichematerieemb1 = fichematerieembRepository.save(ficheMaterieEmb2);
        for (Emballage e:fichematerieemb.getEmballages()){
            if(e.getNumLotEmb()!=0){
                e.setFicheMaterieEmb(fichematerieemb1);
                Emballage emb = emballageRepository.save(e);
                fichematerieemb1.getEmballages().add(emb);
            }
        }
        System.out.println(fichematerieemb1.getEmballages().size());
        /*System.out.println(fichematerieemb.getEmballages());
        FicheMaterieEmb fichematerieemb1 = fichematerieembRepository.save(fichematerieemb);
        for(Emballage e:fichematerieemb.getEmballages()){
            if(e.getNumLotEmb()!=0){
                e.setFicheMaterieEmb(fichematerieemb1);
                Emballage emb = emballageRepository.save(e);
                fichematerieemb1.getEmballages().add(emb);
            }
        }*/
        return fichematerieembRepository.save(fichematerieemb1);
    }

    @Override
    public Optional<FicheMaterieEmb> find(Long id) {
        return fichematerieembRepository.findById(id);
    }

    @Override
    public List<FicheMaterieEmb> findAll() {
        return fichematerieembRepository.findAll();
    }

    @Override
    public List<FicheMaterieEmb> findAll(Sort sort){
        return fichematerieembRepository.findAll(sort);
    }

    @Override
    public Page<FicheMaterieEmb> findAll(Pageable pageable){
        return fichematerieembRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    fichematerieembRepository.deleteById(id);
    }

    @Override
    public void delete(FicheMaterieEmb fichematerieemb) {
        fichematerieembRepository.delete(fichematerieemb);
    }

    @Override
    public void deleteAll() {
        fichematerieembRepository.deleteAll();
    }

    @Override
    public long count() {
        return fichematerieembRepository.count();
    }

    @Override
    public FicheMaterieEmb update(Long id, FicheMaterieEmb ficheMaterieEmb) {
        ficheMaterieEmb.setCodeEmbg(id);
        for(Emballage e:ficheMaterieEmb.getEmballages()){
            e.setFicheMaterieEmb(ficheMaterieEmb);
        }
        System.out.println(ficheMaterieEmb.getResponsable().getNom());
        /* Set<Emballage> res = new HashSet<>();
        for(Emballage e:ficheMaterieEmb.getEmballages()){
            e.setFicheMaterieEmb(ficheMaterieEmb);
            Emballage emballage = emballageService.update(e,e.getCodeEmb());
            res.add(emballage);
        }
        ficheMaterieEmb.getEmballages().clear();
        ficheMaterieEmb.getEmballages().addAll(res);*/
        return fichematerieembRepository.save(ficheMaterieEmb);
    }

}