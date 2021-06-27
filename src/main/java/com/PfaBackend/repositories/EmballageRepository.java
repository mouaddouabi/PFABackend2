package com.PfaBackend.repositories;

import com.PfaBackend.beans.Emballage;
import com.PfaBackend.beans.Ferme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmballageRepository extends JpaRepository<Emballage, Long> {
    @Query(value = "select * from emballage where code_embg = :id",nativeQuery = true)
    public List<Emballage> findEmballagesFiche(@Param("id")Long idf);
}