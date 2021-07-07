package com.PfaBackend.repositories;

import com.PfaBackend.beans.Tracabilite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TracabiliteRepository extends JpaRepository<Tracabilite, Long> {

    @Query(value = "select * from tracabilite where code_lot=:id",nativeQuery = true)
    public Tracabilite findTracebyLot(@Param("id")Long id);
    @Query(value = "delete from tracabilite where code_tracabilite = :id",nativeQuery = true)
    public Tracabilite deleteTrace(@Param("id") Long id);

}