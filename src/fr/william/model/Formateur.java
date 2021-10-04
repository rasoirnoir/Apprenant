package fr.william.model;

public class Formateur {

	private String prenom;
	private String nom;
	private String specialite;
	
	public Formateur(String prenom, String nom, String specialite) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.specialite = specialite;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	

	@Override
	public String toString() {
		return "Formateur [prenom=" + prenom + ", nom=" + nom + ", specialite=" + specialite + "]";
	}
	
}
