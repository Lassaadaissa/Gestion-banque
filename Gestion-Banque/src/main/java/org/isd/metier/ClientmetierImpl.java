package org.isd.metier;

import java.util.List;

import org.isd.dao.ClientReposetory;
import org.isd.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientmetierImpl  implements Clientmetier{
	
	@Autowired
	ClientReposetory clientreposetory ;

	@Override
	public Client saveclient(Client cl) {
		 
		return clientreposetory.save(cl);
	}

	@Override
	public List<Client> listclients() {
		
		return clientreposetory.findAll();
	}

}
