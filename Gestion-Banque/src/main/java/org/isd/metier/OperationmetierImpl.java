package org.isd.metier;

import java.util.Date;

import org.isd.dao.ClientReposetory;
import org.isd.dao.CompteReposetory;
import org.isd.dao.EmployeReposetory;
import org.isd.dao.OperationReposetory;
import org.isd.entities.Compte;
import org.isd.entities.Employes;
import org.isd.entities.Operation;
import org.isd.entities.Retrait;
import org.isd.entities.Versement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OperationmetierImpl  implements Operationmetier{
	
	@Autowired
	CompteReposetory comptereposetory ;
	@Autowired
	EmployeReposetory empreposetory ;
	@Autowired
	OperationReposetory oprepesotory ;
	@Autowired
	EmployeReposetory empr ;
	
   @Transactional
	@Override
	public boolean verser(String codecpte, double montant, Long codeemp) {
		Compte cp = comptereposetory.findOne(codecpte);
		Employes emp = empreposetory.findOne(codeemp);
		Operation o = new Versement();
		o.setEmploye(emp);
		o.setCompte(cp);
		o.setMontant(montant);
		o.setDateOperation(new Date());
		oprepesotory.save(o);
		cp.setSolde(cp.getSolde()+montant);
		return true ;
	}

	@Override
	public void retirer(String codecpte, double montant, long codeemp) {
		Compte cp=comptereposetory.findOne(codecpte);
		if (cp.getSolde()<montant ) throw new RuntimeException ("Solde insuffisant");
		Employes Empl=empr.findOne(codeemp);
		Operation o= new Retrait();
		o.setEmploye(Empl);
		o.setCompte(cp);
		o.setMontant(montant);
		o.setDateOperation(new Date());
		oprepesotory.save(o);
		cp.setSolde(cp.getSolde()-montant);
		
	}

	
	@Transactional
	@Override
	public boolean virement(String cpt1, String cpt2, double solde, Long codeEmpl) {
		
		retirer(cpt1, solde, codeEmpl);
		verser(cpt2, solde, codeEmpl);
		return true;
	}


	public Page<Operation> Listoperations (String codecpte, int page , int size) {
		
		return oprepesotory.findoperations(codecpte, new PageRequest(page, size));
	}

	
	}

	





	
	




