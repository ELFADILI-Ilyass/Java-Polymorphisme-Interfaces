package Ex3;

class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public void afficherType() {
        System.out.println("Cercle: ");
    }
}

