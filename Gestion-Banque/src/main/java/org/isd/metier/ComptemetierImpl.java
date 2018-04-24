package org.isd.metier;

import org.isd.dao.CompteReposetory;
import org.isd.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;


@Service
public class ComptemetierImpl implements Comptemetier {
	
	@Autowired
	CompteReposetory comptereposetory ;

	@Override
	public Compte savecompte(Compte c) {
		return comptereposetory.save(c);
		
	}

	
	
	public Compte consultercompte (String codecompte) {
		
		return comptereposetory.findOne(codecompte);
		
	}

}
