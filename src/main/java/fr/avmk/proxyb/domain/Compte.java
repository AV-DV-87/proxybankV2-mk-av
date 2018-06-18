package fr.avmk.proxyb.domain;
public class Compte {
private int id; 
private double solde;
private Client proprietaire;
public Compte() {
	super();
	// TODO Auto-generated constructor stub
}
public Compte(int id, double solde, Client proprietaire) {
	super();
	this.id = id;
	this.solde = solde;
	this.proprietaire = proprietaire;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public Client getProprietaire() {
	return proprietaire;
}
public void setProprietaire(Client proprietaire) {
	this.proprietaire = proprietaire;
} 


}


