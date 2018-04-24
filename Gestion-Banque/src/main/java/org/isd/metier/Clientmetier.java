package org.isd.metier;

import java.util.List;

import org.isd.entities.Client;

public interface Clientmetier {
	
	public Client saveclient(Client cl);
	public List<Client> listclients();

}
