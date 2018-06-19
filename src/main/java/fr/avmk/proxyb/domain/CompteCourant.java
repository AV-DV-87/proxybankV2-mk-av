package fr.avmk.proxyb.domain;
/**
 * Classe qui hérite de la classe Compte et qui permet d'instancier des comptes courant.
 * @author Arnaud
 *
 */

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
<<<<<<< HEAD
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
=======
	}

	public CompteCourant(int id, double solde, Client proprietaire, double dec) {
		super(id, solde, proprietaire);
>>>>>>> 628d1d29adc8b2c6b5137cb95dfd163926953bd5
		this.dec = dec;
	}

	public double getDec() {
		return dec;
	}

	public void setDec(double dec) {
		this.dec = dec;
	}

}