package fr.avmk.proxyb.dao;

import java.util.List;

import fr.avmk.proxyb.domain.Client;
import fr.avmk.proxyb.domain.Compte;

public interface IClientDao {

	/**
	 * permet de visualiser la liste de clients
	 * @return liste des clients
	 */
	
	public void save(Client c);
	
	public List<Client> findAll();

	public void update(Client c);

	public Client findById(int id);
	
	

}
