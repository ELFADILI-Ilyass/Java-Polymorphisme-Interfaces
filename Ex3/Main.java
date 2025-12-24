package Ex3;

public class Main {
	
	public static void testerCast() {

        Forme f = new Cercle(5);

        if (f instanceof Cercle) {
            Cercle c = (Cercle) f; 
            System.out.println("Downcast Cercle réussi");
        }

        if (f instanceof Rectangle) {
            Rectangle r = (Rectangle) f;
        } else {
            System.out.println("Downcast Cercle vers Rectangle impossible");
        }
	}
    

    public static void main(String[] args) {

        Forme[] formes = new Forme[2];
        formes[0] = new Cercle(3);
        formes[1] = new Rectangle(4, 5);

        for (Forme f : formes) {
            f.afficherType();
            System.out.println("Aire = " + f.calculerAire());

            if (f instanceof Cercle) {
                Cercle c = (Cercle) f;
                System.out.println("Rayon = " + c.getRayon());
            }

            if (f instanceof Rectangle) {
                Rectangle r = (Rectangle) f;
                System.out.println("Longueur = " + r.getLongueur());
                System.out.println("Largeur = " + r.getLargeur());
            }
        }

        testerCast();
        }
    

    }

