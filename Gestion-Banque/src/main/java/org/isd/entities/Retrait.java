package org.isd.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("R")

public class Retrait extends Operation {

	public Retrait(Date dateOperation, double montant, Compte compte, Employes employe) {
		super(dateOperation, montant, compte, employe);
		// TODO Auto-generated constructor stub
	}

	public Retrait() {
		super();
	}
	
	
}