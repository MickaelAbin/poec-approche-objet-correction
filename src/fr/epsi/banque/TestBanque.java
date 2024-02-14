package fr.epsi.banque;

import fr.epsi.banque.entites.Compte;

public class TestBanque {

    public static void main(String[] args) {
        Compte compte = new Compte("123X25", 1500);
        System.out.println(compte);
                
    }
}
