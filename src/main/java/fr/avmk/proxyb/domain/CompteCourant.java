package fr.avmk.proxyb.domain;
/**
 * Classe qui hérite de la classe Compte et qui permet d'instancier des comptes courant.
 * @author Arnaud
 *
 */

public class CompteCourant extends Compte {

	private double dec;

	public CompteCourant() {
		super();
	}

	public CompteCourant(int id, double solde, Client proprietaire, double dec) {
		super(id, solde, proprietaire);
		this.dec = dec;
	}

	public double getDec() {
		return dec;
	}

	public void setDec(double dec) {
		this.dec = dec;
	}

}