package com.PfaBackend.repositories;

import com.PfaBackend.beans.BonEntree;
import com.PfaBackend.beans.FicheConditionnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BonEntreeRepository extends JpaRepository<BonEntree, Long> {
    @Query(value = "select * from bon_entree where code_lot = :code_lot",nativeQuery = true)
    public BonEntree findFicheByLot(@Param("code_lot") Long code_lot);
}