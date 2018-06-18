package fr.avmk.proxyb.domain;

public class Client extends Personne {

private String adresse;
private Conseiller conseiller; 
private String ville; 
private int code;

public Client() {
	super();
}

public Client(int id, String nom, String prenom, String email, String adresse, Conseiller conseiller, String ville, int code) {
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
	return "Client [email=" + super.getEmail() + ", adresse=" + adresse + ", conseiller=" + conseiller + ", ville=" + ville
			+ ", code=" + code + "]";
} 


}
