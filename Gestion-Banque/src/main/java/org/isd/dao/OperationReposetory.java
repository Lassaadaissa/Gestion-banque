package org.isd.dao;

import org.isd.entities.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OperationReposetory extends JpaRepository<Operation, Long>{
	@Query("select o from Operation o where o.compte.codeCompte = :x")
	public Page<Operation> findoperations(@Param("x") String mc,Pageable p);
	
	
	

}
