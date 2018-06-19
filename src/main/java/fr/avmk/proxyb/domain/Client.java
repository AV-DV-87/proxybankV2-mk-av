package fr.avmk.proxyb.domain;

/**
 * Client est la classe représentant un client de BroxiBanque.
 * 
 * @author VALETTE & KHEZNADJI
 * @version 1.0
 */
public class Client extends Personne {

	private String adresse;
	private Conseiller conseiller;
	private String ville;
	private int code;

	public Client() {
		super();
	}

	/**
	 * Constructeur Client avec paramètres
	 * 
	 * @param id
	 *            l'id du Client
	 * @param nom
	 *            le nom du Client
	 * @param prenom
	 *            le prénom du Client
	 * @param email
	 *            l'émail du Client
	 * @param adresse
	 *            l'adresse du Client
	 * @param conseiller
	 *            le Conseiller
	 * @param ville
	 *            la ville de l'adresse du Client
	 * @param code
	 *            le code postal de l'adresse du Client
	 */
	public Client(int id, String nom, String prenom, String email, String adresse, Conseiller conseiller, String ville,
			int code) {
		super(id, nom, prenom, email);
		this.adresse = adresse;
		this.conseiller = conseiller;
		this.ville = ville;
		this.code = code;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Client [email=" + super.getEmail() + ", adresse=" + adresse + ", conseiller=" + conseiller + ", ville="
				+ ville + ", code=" + code + "]";
	}

}
