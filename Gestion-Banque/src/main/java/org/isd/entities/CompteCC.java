package org.isd.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")

public class CompteCC extends Compte{
private double decouvert;

public double getDecouvert() {
	return decouvert;
}

public void setDecouvert(double decouvert) {
	this.decouvert = decouvert;
}

public CompteCC() {
	super();
	// TODO Auto-generated constructor stub
}

public CompteCC(String codeCompte, double solde,double decouvert,Employes employe) {
	super(codeCompte, solde,employe);
	this.decouvert = decouvert;
	// TODO Auto-generated constructor stub
}

public CompteCC(String codeCompte, double solde, Client client, Employes employe, double decouvert) {
	super(codeCompte, solde, client, employe);
	this.decouvert = decouvert;
}

















}