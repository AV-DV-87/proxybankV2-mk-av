package fr.avmk.proxyb.business;

import java.util.List;

import fr.avmk.proxyb.domain.Client;

public interface IClientService {

	/**
	 * Permet de récupérer la liste de l'ensemble des clients
	 * 
	 * @return Liste de client
	 */
	public List<Client> findAllClient();

	/**
	 * retrouve un client à partir de son id
	 * 
	 * @param Id
	 * @return Client cl
	 */
	public Client findById(int Id);

	/**
	 * Permet la mise à jour des informations clients
	 * 
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param codep
	 * @param ville
	 * @param email
	 */
	public void updateClient(int id, String nom, String prenom, String adresse, String codep, String ville,
			String email);
}
