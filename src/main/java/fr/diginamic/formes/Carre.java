package fr.diginamic.formes;

public class Carre extends Rectangle
{
    public int longueur;

    public Carre(int longueur, int largeur) {
        super(longueur, largeur);
        this.longueur = largeur;
    }


    @Override
    public double calculerSurface()
    {
        return getLongueur()*getLargeur();
    }

    @Override
    public double calculerPerimetre()
    {
        return (getLongueur()+getLargeur())*2;
    }
    /**
     * get field
     *
     * @return longueur
     */
    public int getLongueur() {
        return this.longueur;
    }

    /**
     * set field
     *
     * @param longueur
     */
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }
}
