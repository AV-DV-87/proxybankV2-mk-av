package fr.avmk.proxyb.dao;

import java.util.List;

import fr.avmk.proxyb.domain.Client;
import fr.avmk.proxyb.domain.Compte;

public interface ICompteDAO {
	/**
	 * Retrouve un compte à partir de son id
	 * 
	 * @param id
	 * @return
	 */
	public Compte findById(int id);

	/**
	 * Retourne l'ensemble des comptes
	 * 
	 * @return
	 */
	public List<Compte> findAll();

	/**
	 * Retourne les comptes d'un client (proprietaire)
	 * 
	 */
	public List<Compte> findByProprio(int proprio);

	/**
	 * Mise à jour du solde du compte
	 * 
	 * @param solde
	 * @param id
	 */
	public void updateSolde(double solde, int id);

}
