package fr.epsi.piaf.essais;

import fr.epsi.piaf.entites.*;

public class TestPiaf {

    public static void main(String[] args) {
        EstCapableDeVoler[] volants = new EstCapableDeVoler[3];
        volants[0] = new Colibri();
        volants[1] = new Canard();
        volants[2] = new Canard();

        for (EstCapableDeVoler item : volants) {
            item.voler();
        }
        EstCapableDeNager[] tab = new EstCapableDeNager[3];
        tab[0] = new Manchot();
        tab[1] = new Canard();
        tab[2] = new Canard();

        for (EstCapableDeNager item : tab) {
            item.nager();
        }
    }
}
