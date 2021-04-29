package fr.diginamic.essais;

import fr.diginamic.entites.Salarie;

public class TestSalaire {

    public static void main(String[] args){
        String chaine = "Durand;Marcel;2 523.5";
        String[] splitCaractere = chaine.split(";");
        Salarie salarie = new Salarie(splitCaractere[0],splitCaractere[1],2540.3);
    }
}
