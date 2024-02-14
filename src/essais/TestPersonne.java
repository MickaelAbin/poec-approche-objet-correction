package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

    public static void main(String[] args) {

        Personne personne = new Personne("doe", "JOHN");
        personne.afficherNomEtPrenom();
        personne.setAdresse(new AdressePostale("rue beausejour", 49000, "Angers"));
        personne.getAdresse().setNumero(44);

    }
}
