package Ex3;

class Rectangle extends Forme {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

   
    public double getLargeur() {
		return largeur;
	}

	@Override
    public double calculerAire() {
        return longueur * largeur;
    }

    @Override
    public void afficherType() {
        System.out.println("Rectangle: ");
    }
}

