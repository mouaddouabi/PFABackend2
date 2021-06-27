package com.PfaBackend.repositories;

import com.PfaBackend.beans.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResponsableRepository extends JpaRepository<Responsable, Long> {
    public List<Responsable> findResponsableByFonctionRespo(String fonctionRespo);
}