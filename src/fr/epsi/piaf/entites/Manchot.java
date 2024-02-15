package fr.epsi.piaf.entites;

public class Manchot extends Piaf implements EstCapableDeNager {
    @Override
    public void chanter() {
        System.out.println("Je chante comme un Tux");
    }


    @Override
    public void nager() {
        System.out.println("Je nage comme un Tux");
    }
}
