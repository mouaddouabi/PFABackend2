package com.PfaBackend.repositories;

import com.PfaBackend.beans.Operateurs;
import com.PfaBackend.beans.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperateursRepository extends JpaRepository<Operateurs, Long> {
    public List<Operateurs> findOperateursByOperation(String operation);
}