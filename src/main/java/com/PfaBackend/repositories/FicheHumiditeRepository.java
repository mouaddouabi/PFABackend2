package com.PfaBackend.repositories;

import com.PfaBackend.beans.FicheHumidite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FicheHumiditeRepository  extends JpaRepository<FicheHumidite, Long> {
	//change
	@Query(value = "select * from fiche_humidite where code_lot = :code_lot",nativeQuery = true)
	    public FicheHumidite findFicheByLot(@Param("code_lot") Long code_lot);

}
