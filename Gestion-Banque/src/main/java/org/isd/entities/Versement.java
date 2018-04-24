package org.isd.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("V")
public class Versement extends Operation {

	public Versement(Date dateOperation, double montant, Compte compte, Employes employe) {
		super(dateOperation, montant, compte, employe);
		// TODO Auto-generated constructor stub
	}

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}

