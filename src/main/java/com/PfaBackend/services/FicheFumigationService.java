package com.PfaBackend.services;

import com.PfaBackend.beans.FicheFumigation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface FicheFumigationService {

	 FicheFumigation save( FicheFumigation fichefumigation);

	    Optional<FicheFumigation> find(Long id);

	    List< FicheFumigation> findAll();

	    List<FicheFumigation> findAll(Sort sort);

	    Page< FicheFumigation> findAll(Pageable pageable);

	    void delete(Long id);

	    void delete( FicheFumigation  fichefumigation);

	    void deleteAll();

	    long count();

	    FicheFumigation update(Long id,  FicheFumigation fichefumigation);
}
