package utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {
    public static Cercle calculCercle(double param){
        return new Cercle(param);
    }
}
