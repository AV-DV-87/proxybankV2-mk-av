package fr.avmk.proxyb.domain;

public class CompteEpargne extends Compte {
private  double tx;

public CompteEpargne() {
	super();
	// TODO Auto-generated constructor stub
}

public CompteEpargne(int id, double solde, Client proprietaire) {
	super(id, solde, proprietaire);
	// TODO Auto-generated constructor stub
}

public CompteEpargne(double tx) {
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