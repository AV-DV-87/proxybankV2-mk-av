package fr.avmk.proxyb.domain;
/**
 * Classe qui hérite de la classe Compte et qui permet d'instancier des comptes epargne.
 * @author Arnaud
 *
 */

public class CompteEpargne extends Compte {
	private double tx;

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(int id, double solde, Client proprietaire, double tx) {
		super(id, solde, proprietaire);
		this.tx = tx;
	}

	public double getTx() {
		return tx;
	}

	public void setTx(double tx) {
		this.tx = tx;
	}

}