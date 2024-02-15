package fr.epsi.geo.entites;

public abstract class Figure {
    protected String couleur;
    protected int nbAngles;

    public Figure() {
        this("transparent", 0);
    }

    public Figure(String couleur, int nbAngles) {
        this.couleur = couleur;
        this.nbAngles = nbAngles;
    }

    public abstract double calculerPerimetre();

    public abstract double calculerSurface();
}
