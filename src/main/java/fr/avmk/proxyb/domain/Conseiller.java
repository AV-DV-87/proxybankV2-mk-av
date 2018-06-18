package fr.avmk.proxyb.domain;

public class Conseiller extends Personne {
private String login; 
private String password;

/**
 * Cosntructeur par défaut
 */
public Conseiller() {
	super();
	// TODO Auto-generated constructor stub
}


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