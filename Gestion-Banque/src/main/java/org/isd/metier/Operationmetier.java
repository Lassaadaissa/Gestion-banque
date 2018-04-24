package org.isd.metier;



public interface Operationmetier {
	
	public boolean verser (String codecpte , double montant,Long codeemp);
	public void retirer (String codecpte , double montant,long codeemp);
	public boolean virement( String cpt1, String cpt2, double solde, Long codeEmpl);

	

 
}
