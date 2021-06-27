package com.PfaBackend.repositories;

import com.PfaBackend.beans.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {
    Fournisseur findFournisseurById(Long id);
}