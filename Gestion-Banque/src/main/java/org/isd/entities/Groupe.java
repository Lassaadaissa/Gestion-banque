package org.isd.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Groupes")
public class Groupe implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeGroupe;
	private String nomGroupe;
	@ManyToMany(mappedBy="groupes")
	private Collection<Employes> employes;
	public Long getCodeGroupe() {
		return codeGroupe;
	}
	public void setCodeGroupe(Long codeGroupe) {
		this.codeGroupe = codeGroupe;
	}
	public String getNomGroupe() {
		return nomGroupe;
	}
	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	public Collection<Employes> getEmployes() {
		return employes;
	}
	public void setEmployes(Collection<Employes> employes) {
		this.employes = employes;
	}
	public Groupe() {
		super();
	}
	public Groupe(String nomGroupe, Collection<Employes> employes) {
		super();
		this.nomGroupe = nomGroupe;
		this.employes = employes;
	}
	
	
}
