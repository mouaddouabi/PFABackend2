package com.PfaBackend.repositories;

import com.PfaBackend.beans.FicheReception;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FicheReceptionRepository extends JpaRepository<FicheReception, Long> {
    public FicheReception findFicheReceptionByCodeRecep(Long codeRecep);
    @Query(value = "select * from fiche_reception where code_lot = :code_lot",nativeQuery = true)
    public FicheReception findFicheByLot(@Param("code_lot") Long code_lot);
}