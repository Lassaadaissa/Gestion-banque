package org.isd.dao;

import org.isd.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CompteReposetory  extends JpaRepository<Compte,String> {
	


}
