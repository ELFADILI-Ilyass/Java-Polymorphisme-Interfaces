package com.garage;

public class Voiture extends Vehicule {
	
	private int nombreDePortes;
	public Voiture(String marq, String mode, int an,int nbrP) {
		super(marq, mode, an);
		this.nombreDePortes=nbrP;
		
	}
	
	@Override
    public  void afficherDetails() {
		super.afficherDetails();
		System.out.println("Nombre de portes: "+nombreDePortes);
	}
	
	
	
}
