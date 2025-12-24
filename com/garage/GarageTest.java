package com.garage;

public class GarageTest {

	public static void main(String[] args) {
		
		Vehicule vc=new Voiture("Mercedes","Benz",2025,4);
		Vehicule vm=new Moto("Toyota","Corolla",2022,1800);
		
		vc.afficherDetails();
		vm.afficherDetails();

	}

}
