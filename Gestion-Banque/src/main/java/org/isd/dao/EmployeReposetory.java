package org.isd.dao;

import org.isd.entities.Employes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeReposetory extends JpaRepository<Employes, Long>{

}
