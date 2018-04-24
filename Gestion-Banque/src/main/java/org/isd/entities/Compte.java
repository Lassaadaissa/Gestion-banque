package org.isd.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_CPT", discriminatorType=DiscriminatorType.STRING, length=2)

public abstract class Compte implements Serializable{
	
@Id
private String codeCompte;

private Date dateCreation;
private double solde;
@JsonIgnore
@ManyToOne
@JoinColumn(name="Code_Cli")
private Client client ;
@JsonIgnore
@ManyToOne
@JoinColumn(name="Code_Emp")
private Employes employe;
@JsonIgnore
@OneToMany( mappedBy="compte")
private Collection <Operation> operations;
public String getCodeCompte() {
	return codeCompte;
}
public void setCodeCompte(String codeCompte) {
	this.codeCompte = codeCompte;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
public Employes getEmploye() {
	return employe;
}
public void setEmploye(Employes employe) {
	this.employe = employe;
}
public Collection<Operation> getOperations() {
	return operations;
}
public void setOperations(Collection<Operation> operations) {
	this.operations = operations;
}
public Compte() {
	super();
}
public Compte(Date dateCreation, double solde, Client client, Employes employe, Collection<Operation> operations) {
	super();
	this.dateCreation = dateCreation;
	this.solde = solde;
	this.client = client;
	this.employe = employe;
	this.operations = operations;
}
public Compte(String codeCompte,  double solde, Client client, Employes employe) {
	super();
	this.codeCompte = codeCompte;

	this.solde = solde;
	this.client = client;
	this.employe = employe;
}
public Compte(String codeCompte, double solde,Employes employe) {
	super();
	this.codeCompte = codeCompte;
	this.solde = solde;
	this.employe = employe;
}











}