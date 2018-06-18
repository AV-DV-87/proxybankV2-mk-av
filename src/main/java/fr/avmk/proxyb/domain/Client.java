package fr.avmk.proxyb.domain;

public class Client extends Personne {

private String email; 
private String adresse;
private Conseiller conseiller; 
private String ville; 
private int code;

public Client() {
	super();
	// TODO Auto-generated constructor stub
}
public Client(int id, String name, String prenom, String email) {
	super(id, name, prenom, email);
	// TODO Auto-generated constructor stub
}
public Client(String email, String adresse, Conseiller conseiller, String ville, int code) {
	super();
	this.email = email;
	this.adresse = adresse;
	this.conseiller = conseiller;
	this.ville = ville;
	this.code = code;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
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
	return "Client [email=" + email + ", adresse=" + adresse + ", conseiller=" + conseiller + ", ville=" + ville
			+ ", code=" + code + "]";
} 


}
