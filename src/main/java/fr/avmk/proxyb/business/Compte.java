package fr.avmk.proxyb.business;

public class Compte {
public int id; 
public double solde;


public Compte() {
	super();
	// TODO Auto-generated constructor stub
}
public Compte(int id, double solde) {
	super();
	this.id = id;
	this.solde = solde;
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




}
