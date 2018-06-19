package fr.avmk.proxyb.business;

import java.util.List;

import fr.avmk.proxyb.dao.CompteDao;
import fr.avmk.proxyb.dao.ICompteDao;
import fr.avmk.proxyb.domain.Compte;



public class CompteService implements ICompteService {
     ICompteDao dao=new CompteDao();
	
	@Override
	public Compte getValidatedCompte(int id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Compte> getAllCompte() {
	
		return dao.findAll();
	}

}
