package org.isd.metier;

import java.util.List;

import org.isd.dao.EmployeReposetory;
import org.isd.entities.Employes;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeesmetierImpl implements Emplyemetier{
	
	@Autowired
	EmployeReposetory empreposetory ;

	@Override
	public Employes saveemploye(Employes emp) {
		return empreposetory.save(emp);
	}

	@Override
	public List<Employes> listemployes() {
		
		return empreposetory.findAll();
	}

}
