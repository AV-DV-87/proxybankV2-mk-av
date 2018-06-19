package fr.avmk.proxyb.domain;
<<<<<<< HEAD

/**
 * Compte est la classe représentant un compte bancaire de BroxiBanque.
 * 
 * @author VALETTE & KHEZNADJI
 * @version 1.0
=======
/**
 * Classe permettant de regrouper les attributs d'un compte.
 * @author Arnaud
 *
>>>>>>> 628d1d29adc8b2c6b5137cb95dfd163926953bd5
 */
public class Compte {
	private int id;
	private double solde;
	private Client proprietaire;

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

<<<<<<< HEAD
	/**
	 * Constructeur Compte avec paramètres
	 * 
	 * @param id
	 *            l'id du Compte
	 * @param solde
	 *            le solde du Compte
	 * @param proprietaire
	 *            le Client
	 */
=======
>>>>>>> 628d1d29adc8b2c6b5137cb95dfd163926953bd5
	public Compte(int id, double solde, Client proprietaire) {
		super();
		this.id = id;
		this.solde = solde;
		this.proprietaire = proprietaire;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Client getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}

}
