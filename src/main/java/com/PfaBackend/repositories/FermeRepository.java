package com.PfaBackend.repositories;

import com.PfaBackend.beans.Ferme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FermeRepository extends JpaRepository<Ferme, Long> {
    @Query(value = "select * from ferme where code_fr = :id",nativeQuery = true)
    public List<Ferme> findFermesFournisseur(@Param("id")Long idf);
}