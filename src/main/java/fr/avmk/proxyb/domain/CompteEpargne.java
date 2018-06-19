package fr.avmk.proxyb.domain;
/**
 * Classe qui hérite de la classe Compte et qui permet d'instancier des comptes epargne.
 * @author Arnaud
 *
 */

/**
 * CompteEpargne est la classe représentant un compte épargne à la banque
 * BroxiBanque.
 * 
 * @author VALLETTE & KHEZNADJI.
 * @version 1.0
 */
public class CompteEpargne extends Compte {
	private double tx;

	public CompteEpargne() {
		super();
<<<<<<< HEAD
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur CompteEpargne avec paramètres.
	 * 
	 * @param id
	 *            l'id du CompteEpargne
	 * @param solde
	 *            le solde du CompteEpargne
	 * @param proprietaire
	 *            le Client
	 */
	public CompteEpargne(int id, double solde, Client proprietaire) {
		super(id, solde, proprietaire);
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(double tx) {
		super();
		this.tx = tx;
	}

	public double getTx() {
		return tx;
	}

=======
	}

	public CompteEpargne(int id, double solde, Client proprietaire, double tx) {
		super(id, solde, proprietaire);
		this.tx = tx;
	}

	public double getTx() {
		return tx;
	}

>>>>>>> 628d1d29adc8b2c6b5137cb95dfd163926953bd5
	public void setTx(double tx) {
		this.tx = tx;
	}

}