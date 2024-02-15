package fr.epsi.geo.entites;

public class Carre extends Figure {
    private double cote;

    public Carre(double cote) {
        this.cote = cote;
        this.nbAngles = 4;
    }

    public Carre(String couleur, int nbAngles, double cote) {
        super(couleur, 4);
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public double calculerPerimetre() {
        return 4 * cote;
    }

    @Override
    public double calculerSurface() {
        return Math.pow(cote, 2);
    }
}
