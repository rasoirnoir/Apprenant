package fr.william.model;

import java.util.Objects;

public class Apprenant {
	
	private String prenom;
	private String nom;
	private int age;
	
	public Apprenant(String _prenom, String _nom, int _age) {
		this.prenom = _prenom;
		this.nom = _nom;
		this.age = _age;
	}
	
	public Apprenant() {
		this(null, null, 0); //le mot clé "this" appel un autre constructeur
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, nom, prenom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apprenant other = (Apprenant) obj;
		return age == other.age && Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom);
	}

	@Override
	public String toString() {
		return "Apprenant [prenom=" + prenom + ", nom=" + nom + ", age=" + age + "]";
	}

	public String getPrenom() {
		return this.prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
