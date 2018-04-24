package org.isd.metier;

import java.util.List;

import org.isd.entities.Employes;

public interface Emplyemetier {
	public Employes saveemploye(Employes emp);
	public List<Employes> listemployes();

}
