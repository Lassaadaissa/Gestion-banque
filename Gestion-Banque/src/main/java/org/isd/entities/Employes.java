package org.isd.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employes implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long codeEmploye;
private String nomEmploye;
@JsonIgnore
@ManyToOne
@JoinColumn(name="Code_emp_sup" )
private Employes EmployesSup;
@JsonIgnore
@ManyToMany
@JoinTable(name="Emp_Gr", joinColumns= {@JoinColumn(name="Num_EMP")},inverseJoinColumns={@JoinColumn(name="Num_Groupe")})
private Collection<Groupe> groupes;
public Long getCodeEmploye() {
	return codeEmploye;
}
public void setCodeEmploye(Long codeEmploye) {
	this.codeEmploye = codeEmploye;
}
public String getNomEmploye() {
	return nomEmploye;
}
public void setNomEmploye(String nomEmploye) {
	this.nomEmploye = nomEmploye;
}
public Employes getEmployesSup() {
	return EmployesSup;
}
public void setEmployesSup(Employes employesSup) {
	EmployesSup = employesSup;
}
public Collection<Groupe> getGroupes() {
	return groupes;
}
public void setGroupes(Collection<Groupe> groupes) {
	this.groupes = groupes;
}
public Employes(String nomEmploye, Employes employesSup, Collection<Groupe> groupes) {
	super();
	this.nomEmploye = nomEmploye;
	EmployesSup = employesSup;
	this.groupes = groupes;
}
public Employes() {
	super();
}
public Employes(String nomEmploye) {
	super();
	this.nomEmploye = nomEmploye;
}






}