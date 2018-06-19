package fr.avmk.proxyb.domain;

/**
 * Conseiller est la classe représentant un conseiller de la banque BroxiBanque.
 * 
 * @author VALLETTE & KHEZNADJI
 * @version 1.0
 */
public class Conseiller extends Personne {
	private String login;
	private String password;

	
	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur Conseiller avec paramètres
	 * 
	 * @param id
	 *            l'identifiant du Conseiller
	 * @param nom
	 *            le nom du Conseiller
	 * @param prenom
	 *            le prénom du Conseiller
	 * @param email
	 *            l'émail du Conseiller
	 * @param login
	 *            le login du Conseiller
	 * @param password
	 *            le password du Conseiller
	 */
	public Conseiller(int id, String nom, String prenom, String email, String login, String password) {
		super(id, nom, prenom, email);
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}