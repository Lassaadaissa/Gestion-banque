package org.isd.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length=1)

public class Operation implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long numeroOperation;
private Date dateOperation;
private double montant;

@JsonIgnore
@ManyToOne
@JoinColumn(name="Code_CPT")
private Compte compte;
@JsonIgnore
@ManyToOne
@JoinColumn(name="Code_Employe")
private Employes employe;
public Long getNumeroOperation() {
	return numeroOperation;
}
public void setNumeroOperation(Long numeroOperation) {
	this.numeroOperation = numeroOperation;
}
public Date getDateOperation() {
	return dateOperation;
}
public void setDateOperation(Date dateOperation) {
	this.dateOperation = dateOperation;
}
public double getMontant() {
	return montant;
}
public void setMontant(double montant) {
	this.montant = montant;
}
public Compte getCompte() {
	return compte;
}
public void setCompte(Compte compte) {
	this.compte = compte;
}
public Employes getEmploye() {
	return employe;
}
public void setEmploye(Employes employe) {
	this.employe = employe;
}
public Operation(Date dateOperation, double montant, Compte compte, Employes employe) {
	super();
	this.dateOperation = dateOperation;
	this.montant = montant;
	this.compte = compte;
	this.employe = employe;
}
public Operation() {
	super();
}



}