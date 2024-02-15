package fr.epsi.geo.entites;

public class Cercle extends Figure {

    private double rayon;

    public Cercle(double rayon) {
        super();
        this.rayon = rayon;
    }

    public Cercle(String couleur, double rayon) {
        super(couleur, 0);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double calculerSurface() {
        return Math.PI * Math.pow(rayon, 2) ;
    }
}
