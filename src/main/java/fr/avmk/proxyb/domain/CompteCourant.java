package fr.avmk.proxyb.domain;

/**
 * CompteCourant est la classe représentant un compte courant à la banque
 * BroxiBanque.
 * 
 * @author VALLETTE & KHEZNADJI
 * @version 1.0
 */
public class CompteCourant extends Compte {

	private double dec;

	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur CompteCourant avec paramètres
	 * 
	 * @param id
	 *            l'id du CompteCourant.
	 * @param solde
	 *            le solde du CompteCourant
	 * @param proprietaire
	 *            le Client.
	 */
	public CompteCourant(int id, double solde, Client proprietaire) {
		super(id, solde, proprietaire);
		// TODO Auto-generated constructor stub
	}

	public CompteCourant(double dec) {
		super();
		this.dec = dec;
	}

	public double getDec() {
		return dec;
	}

	public void setDec(double dec) {
		this.dec = dec;
	}

}