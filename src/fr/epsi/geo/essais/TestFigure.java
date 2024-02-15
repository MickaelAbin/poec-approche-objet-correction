package fr.epsi.geo.essais;

import fr.epsi.geo.entites.Carre;
import fr.epsi.geo.entites.Cercle;
import fr.epsi.geo.entites.Figure;
import fr.epsi.geo.entites.Rectangle;

public class TestFigure {
    public static void main(String[] args) {
        Figure[] figures = {new Cercle(5.0), new Rectangle(5, 4), new Carre(5)};

        for(Figure item : figures) {
            System.out.printf("La surface du type %s est égale à %.02f%n", item.getClass().getSimpleName(), item.calculerSurface());
            System.out.printf("Le périmètre du type %s est égale à %.02f%n", item.getClass().getSimpleName(), item.calculerPerimetre());
        }
    }
}
