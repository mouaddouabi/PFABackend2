package com.PfaBackend.repositories;

import com.PfaBackend.beans.FicheConditionnement;
import com.PfaBackend.beans.FicheReception;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FicheConditionnementRepository extends JpaRepository<FicheConditionnement, Long> {
    @Query(value = "select * from fiche_conditionnement where code_lot = :code_lot",nativeQuery = true)
    public FicheConditionnement findFicheByLot(@Param("code_lot") Long code_lot);
    public FicheConditionnement findFicheConditionnementByCodeCondi(Long codeCondi);
}