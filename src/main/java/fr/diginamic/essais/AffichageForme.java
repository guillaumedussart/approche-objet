package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme
{
    public void afficher(Forme forme)
    {
        System.out.println("Le perimetre du "+forme.getClass().getSimpleName()+" est "+forme.calculerPerimetre()+" et la surface du "+forme.getClass().getSimpleName()+" est "+ forme.calculerSurface());
    }
}
