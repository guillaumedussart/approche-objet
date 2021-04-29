package fr.diginamic.chaines;

import java.util.Locale;

public class ManipulationChaine {
    public static void main(String[] args){
        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        int longCaractere = chaine.length();
        int findCaractere = chaine.indexOf(";");
        String cutCaractere = chaine.substring(0,findCaractere);
        String[] splitCaractere = chaine.split(";");
        System.out.println("Premier caractère: " + premierCaractere);
        System.out.println("La longueur de la chaine "+chaine+" est: " + longCaractere);
        System.out.println("Le caractere ';' de la chaine "+chaine+" est a l'index: " + findCaractere);
        System.out.println("Je coupe la chaine "+chaine+" a partir de ';' " + cutCaractere);
        System.out.println("Je coupe la chaine "+chaine+" a partir de ';' " + cutCaractere.toUpperCase(Locale.ROOT)+" mis en majuscule");
        System.out.println("Je coupe la chaine "+chaine+" a partir de ';' " + cutCaractere.toLowerCase(Locale.ROOT)+" mis en minuscule");
        System.out.println("Le nom extrait de la chaine "+chaine+" est : "+splitCaractere[0]);
        System.out.println("Le prenom extrait de la chaine "+chaine+" est : "+splitCaractere[1]);
        System.out.println("Le salaire extrait de la chaine "+chaine+" est : "+splitCaractere[2]+" $");
    }
}
