package com.garage;

public class Moto extends Vehicule{
	private int cylindree;
	
	public Moto(String marq, String mode, int an, int cylind) {
		super(marq, mode, an);
		this.cylindree=cylind;
	}
	
	@Override
    public  void afficherDetails() {
		super.afficherDetails();
		System.out.println("Cylindree: "+cylindree);
	}

	
}
