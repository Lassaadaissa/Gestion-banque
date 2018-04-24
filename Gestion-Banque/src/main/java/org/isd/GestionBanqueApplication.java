 package org.isd;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.isd.dao.ClientReposetory;
import org.isd.dao.CompteReposetory;
import org.isd.dao.EmployeReposetory;
import org.isd.dao.OperationReposetory;
import org.isd.entities.Client;
import org.isd.entities.Compte;
import org.isd.entities.CompteCC;
import org.isd.entities.Employes;
import org.isd.metier.OperationmetierImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class GestionBanqueApplication implements CommandLineRunner{
	
	 @Autowired
	 CompteReposetory com ;
	 @Autowired
	EmployeReposetory emp ;
	 
	 @Autowired
	 ClientReposetory co ;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionBanqueApplication.class, args);
	}
	

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	    Client c = new Client("lassad aissa");
	    Employes e = new Employes("lasss");
	    Compte cc = new  CompteCC("C1", 20, c, e, 10) ;
	    
	    
		co.save(c);
		emp.save(e);
		com.save(cc);
		
		
	}
}
