package fr.william.main;

import fr.william.model.Apprenant;
import fr.william.model.Promo;

public class Application {

	public static void main(String[] args) {

		Apprenant apprenant1 = new Apprenant();
		apprenant1.setPrenom("Pierre");
		apprenant1.setNom("Ricard");
		apprenant1.setAge(72);
		
		System.out.println(apprenant1);
		
		Apprenant a2 = new Apprenant("Jean", "Delarue", 27);
		
		System.out.println(a2);
		
		Promo p5 = new Promo("Promo 5 La Poste");
		p5.ajouterApprenant(apprenant1);
		p5.ajouterApprenant(a2);
		
		p5.afficherListe();

	}

}
