package fr.avmk.proxyb.domain;

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

	public void setTx(double tx) {
		this.tx = tx;
	}

}