package fr.avmk.proxyb.business;

public class Conseiller extends Personne {
private String login; 
private String password;
private Client client;


public Conseiller() {
	super();
	// TODO Auto-generated constructor stub
}
public Conseiller(int id, String name, String prenom, String email) {
	super(id, name, prenom, email);
	// TODO Auto-generated constructor stub
}
public Conseiller(String login, String password, Client client) {
	super();
	this.login = login;
	this.password = password;
	this.client = client;
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
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
} 



}
