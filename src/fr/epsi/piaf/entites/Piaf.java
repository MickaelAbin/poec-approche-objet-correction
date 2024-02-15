package fr.epsi.piaf.entites;

public abstract class Piaf {

    private String nom;

    static {
        System.out.println("Ici on vient la classe Piaf");
    }

    {
        System.out.println("Ici on a appelé un constructeur");
    }
    public abstract void chanter();
}
