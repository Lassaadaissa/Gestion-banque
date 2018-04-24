package org.isd.dao;

import org.isd.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientReposetory  extends  JpaRepository<Client, Long>{
	

}
