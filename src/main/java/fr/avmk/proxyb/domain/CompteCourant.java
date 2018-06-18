package fr.avmk.proxyb.domain;

public class CompteCourant extends Compte {
	
private double dec;

public CompteCourant() {
	super();
	// TODO Auto-generated constructor stub
}

public CompteCourant(int id, double solde, Client proprietaire) {
	super(id, solde, proprietaire);
	// TODO Auto-generated constructor stub
}

public CompteCourant(double dec) {
	super();
	this.dec = dec;
}

public double getDec() {
	return dec;
}

public void setDec(double dec) {
	this.dec = dec;
}

}