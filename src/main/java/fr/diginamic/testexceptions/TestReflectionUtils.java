package fr.diginamic.testexceptions;

import listes.Continent;
import listes.Ville;


public class TestReflectionUtils  {
    public static void main(String[] args)  {
        Ville ville = new Ville(Continent.AFRIQUE,"Congo",125_000);
        try {
           ReflectionUtils.afficherAttributs(null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
