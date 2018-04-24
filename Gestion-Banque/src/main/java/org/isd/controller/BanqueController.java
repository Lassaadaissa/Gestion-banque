package org.isd.controller;

import org.isd.entities.Compte;
import org.isd.entities.Operation;
import org.isd.metier.ComptemetierImpl;
import org.isd.metier.OperationmetierImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BanqueController {
	
	@Autowired
	ComptemetierImpl comptemetierimpl ;
	
	@Autowired
	OperationmetierImpl opmetierimpl ;
	
	
    @RequestMapping("/comptes")
	public Compte Consulter (String codecpte) {
    	
	  Compte cp = comptemetierimpl.consultercompte(codecpte);
	  return cp ;
				
	}

@RequestMapping(value="/versement",method=RequestMethod.PUT)
      public boolean verser(
	 @RequestParam String codecompte ,
	 @RequestParam double montant ,
	 @RequestParam Long codeemp)
      {	
	  return opmetierimpl.verser(codecompte, montant, codeemp);
}

@RequestMapping(value="/operations")
public Page <Operation> charger(@RequestParam String codecompte, @RequestParam int page ,@RequestParam int size)
{	
	
return opmetierimpl.Listoperations(codecompte,page,size);

}






}
