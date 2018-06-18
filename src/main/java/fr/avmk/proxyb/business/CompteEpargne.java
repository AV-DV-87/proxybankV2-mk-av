package fr.avmk.proxyb.business;

public class CompteEpargne extends Compte {
private  double dec;

public CompteEpargne() {
	super();
	// TODO Auto-generated constructor stub
}

public CompteEpargne(int id, double solde) {
	super(id, solde);
	// TODO Auto-generated constructor stub
}

public double getDec() {
	return dec;
}

public void setDec(double dec) {
	this.dec = dec;
} 

}
