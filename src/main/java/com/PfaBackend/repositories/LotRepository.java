package com.PfaBackend.repositories;

import com.PfaBackend.beans.Lot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LotRepository extends JpaRepository<Lot, Long> {
    public Lot findLotByCodeLot(Long codeLot);
}