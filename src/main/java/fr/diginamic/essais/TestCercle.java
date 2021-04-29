package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args){
        CercleFactory cercle1 = new CercleFactory();
        CercleFactory cercle2 = new CercleFactory();
        System.out.println(cercle1.calculCercle(50));
        System.out.println(cercle2.calculCercle(25));
    }
}
