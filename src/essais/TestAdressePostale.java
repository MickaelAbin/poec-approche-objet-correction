package essais;

import entites.AdressePostale;

public class TestAdressePostale {

    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale( "Foch", 49000, "Angers");
adr1.codePostal = 4900;
        AdressePostale adr2 = new AdressePostale("Soif", 44000, "Nte");
        System.out.println(adr1.ville);
    }
}
