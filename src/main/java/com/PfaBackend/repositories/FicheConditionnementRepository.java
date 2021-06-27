package com.PfaBackend.repositories;

import com.PfaBackend.beans.FicheConditionnement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FicheConditionnementRepository extends JpaRepository<FicheConditionnement, Long> {
}