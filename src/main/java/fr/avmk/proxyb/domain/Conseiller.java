package fr.avmk.proxyb.domain;

public class Conseiller extends Personne {
private String login; 
private String password;
public Conseiller() {
	super();
	// TODO Auto-generated constructor stub
}
public Conseiller(int id, String name, String prenom, String email) {
	super(id, name, prenom, email);
	// TODO Auto-generated constructor stub
}
public Conseiller(String login, String password) {
	super();
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