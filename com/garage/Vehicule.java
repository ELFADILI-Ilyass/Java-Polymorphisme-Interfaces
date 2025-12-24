package com.garage;

public class Vehicule {

	protected String marque;
	protected String modele;
	protected int annee;
	
	public Vehicule (String marq, String mode, int an) {
		this.marque=marq;
		this.modele=mode;
		this.annee=an;
	}
	
	public  void afficherDetails() {
		
		System.out.println("Marque : "+marque+",Modele : "+modele+",Annee : "+annee);
		
	}
}