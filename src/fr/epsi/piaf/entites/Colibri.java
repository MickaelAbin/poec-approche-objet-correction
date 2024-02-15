package fr.epsi.piaf.entites;

public class Colibri extends Piaf implements EstCapableDeVoler {
    @Override
    public void chanter() {
        System.out.println("Je chante comme un colibri");
    }

    @Override
    public void voler() {
        System.out.println("Je vole sur place");
    }
}
