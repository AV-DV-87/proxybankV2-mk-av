package fr.avmk.proxyb.business;

public class Personne {
	private int id; 
	private String name; 
	private String prenom;
	private String email;
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personne(int id, String name, String prenom, String email) {
		super();
		this.id = id;
		this.name = name;
		this.prenom = prenom;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	
	
	
}