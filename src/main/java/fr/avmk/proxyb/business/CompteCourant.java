package fr.avmk.proxyb.business;

public class CompteCourant extends Compte {
	
private double tx;

public CompteCourant() {
	super();
	// TODO Auto-generated constructor stub
}

public CompteCourant(double tx) {
	super();
	this.tx = tx;
}

public double getTx() {
	return tx;
}

public void setTx(double tx) {
	this.tx = tx;
}





}
