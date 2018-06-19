package fr.avmk.proxyb.business;

import java.util.List;

import fr.avmk.proxyb.dao.CompteDAO;
import fr.avmk.proxyb.dao.ICompteDAO;
import fr.avmk.proxyb.domain.Compte;



public class CompteService implements ICompteService {
     ICompteDAO dao=new CompteDAO();
	
	@Override
	public Compte getValidatedCompte(int id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Compte> getAllCompte() {
	
		return dao.findAll();
	}

}
