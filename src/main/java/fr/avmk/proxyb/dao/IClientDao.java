package fr.avmk.proxyb.dao;

import java.util.List;

import fr.avmk.proxyb.domain.Client;
import fr.avmk.proxyb.domain.Compte;

public interface IClientDao {

	/**
	 * permet de visualiser la liste de clients
	 * @return List liste des clients
	 */
	public List<Client> findAllClient();
	/**
	 * Permets de mettre à jour les informations d'un client
	 * @param c Client
	 */
	public void update(Client c);
	/**
	 * Permet de trouver un client à partir de son id
	 * @return List liste des clients
	 * @param int id identifiant à rechercher
	 */
	public Client findById(int id);
	
	

}
