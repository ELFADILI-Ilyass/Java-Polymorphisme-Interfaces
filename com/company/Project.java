package com.company;

public class Project {
	private String nomProjet;
	private Developer [] dev;
	private int nbrDev;
	
	public Project(String n) {
		this.nomProjet=n;
		dev=new Developer[5];
		nbrDev=0;
	}

	public void ajouterDeveloppeur(Developer d) {
		if(nbrDev < dev.length) {
			dev[nbrDev]=d;
			nbrDev++;
		}
		else
			System.out.println("Plein");
	}
	
	public void afficherEquipe() {
		  System.out.println("Nom de projet : "+nomProjet);
		  System.out.println("Nombre de devloppers: "+nbrDev);
		  for (int i = 0; i < nbrDev; i++) {
		    	
		        System.out.println(dev[i].getNom());
		        
		    }
		  
	}
}
