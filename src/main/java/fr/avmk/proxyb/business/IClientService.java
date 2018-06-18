package fr.avmk.proxyb.business;

import java.util.List;

import fr.avmk.proxyb.domain.Client;

public interface IClientService {
	/**
	 * Permet de récupérer la liste de l'ensemble des clients
	 * @return Liste de client
	 */
	public List<Client> findAllClient();
	/**
	 * retrouve un client à partir de son id
	 * @param Id
	 * @return Client cl
	 */
	public Client findById(int Id);
}
