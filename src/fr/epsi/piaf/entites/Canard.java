package fr.epsi.piaf.entites;

public class Canard extends Piaf implements EstCapableDeNager, EstCapableDeVoler {
    @Override
    public void nager() {
        System.out.println("Je nage comme Donald");
    }

    @Override
    public void voler() {
        System.out.println("Je vole comme Donald");
    }

    @Override
    public void chanter() {
        System.out.println("Je change comme donald");
    }
}
