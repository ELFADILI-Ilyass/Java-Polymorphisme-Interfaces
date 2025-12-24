package GestionProjet;

import com.company.Developer;
import com.company.Project;

public class Test {

	public static void main(String[] args) {
		Developer dev1= new Developer("Ilyass");
		Developer dev2= new Developer("Ahmed");
		Developer dev3= new Developer("Samir");
		
		Project pr= new Project("Meteo");
		pr.ajouterDeveloppeur(dev1);
		pr.ajouterDeveloppeur(dev2);
		pr.ajouterDeveloppeur(dev3);
		
		pr.afficherEquipe();
		
		

	}

}
