package fr.william.model;

import java.util.ArrayList;

public class Promo {

	private String intitule;
	private ArrayList<Apprenant> apprenants;
	private Formateur referent;
	private Formateur formateurAdjoint;
	
	public Promo(String intitule) {
		this.intitule = intitule;
		apprenants = new ArrayList<Apprenant>();
	}
	
	public void ajouterApprenant(Apprenant appr) {
		this.apprenants.add(appr);
	}
	
	public void afficherListe() {
		System.out.println("Liste des apprenants de " + this.intitule + " :");
		for (Apprenant apprenant : apprenants) {
			System.out.println(apprenant);
		}
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Formateur getReferent() {
		return referent;
	}

	public void setReferent(Formateur referent) {
		this.referent = referent;
	}

	public Formateur getFormateur() {
		return formateurAdjoint;
	}

	public void setFormateur(Formateur formateur) {
		this.formateurAdjoint = formateur;
	}

	@Override
	public String toString() {
		return "Promo [intitule=" + intitule + ", apprenants=" + apprenants + ", referent=" + referent + ", formateur="
				+ formateurAdjoint + "]";
	}
	
	
	
}
