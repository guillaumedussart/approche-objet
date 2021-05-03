package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.ObjetGeometrique;
import fr.diginamic.formes.Rectangle;

public class TestObjetGeometrique {
    public static void main(String[] args){
        ObjetGeometrique[] objectforme = {
                new Cercle(4),
                new Rectangle(5, 6)
        };
        System.out.println(objectforme);
    }
}
