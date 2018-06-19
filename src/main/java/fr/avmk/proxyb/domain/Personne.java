package fr.avmk.proxyb.domain;

/**
 * Personne est la classe représentant la classe mère de la classe client et
 * conseiller.
 * 
 * @author VALLETTE & KHEZNADJI
 * @version 1.0
 */
public class Personne {
	private int id;
	private String nom;
	private String prenom;
	private String email;

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur Personne avec paramètres
	 * 
	 * @param id
	 *            l'id de Personne
	 * @param nom
	 *            le nom de Personne
	 * @param prenom
	 *            le prénom de Personne
	 * @param email
	 *            l'émail de Personne
	 */
	public Personne(int id, String nom, String prenom, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}