package fr.diginamic.essais;

import fr.diginamic.salaire.Freelance;
import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Salaried;

public class TestIntervenant
{
    public static void main(String[] args)
    {
        Intervenant franck = new Salaried("Franck","Test",1589.3,"CDI");
        Intervenant paul = new Freelance("Paul","Sami",25,230.5);
        System.out.println(franck.displayData());
        System.out.println(paul.displayData());
    }
}
