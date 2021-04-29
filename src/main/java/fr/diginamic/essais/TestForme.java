package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

public class TestForme
{
    public static void main(String[] args)
    {
        Forme cercle = new Cercle(25);
        Forme carre = new Carre(50,50);
        Forme rectangle = new Rectangle(15,36);

        AffichageForme affichage = new AffichageForme();
        affichage.afficher(cercle);
        affichage.afficher(carre);
        affichage.afficher(rectangle);
    }
}
