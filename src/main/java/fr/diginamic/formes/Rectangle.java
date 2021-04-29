package fr.diginamic.formes;

public class Rectangle extends Forme
{
    public int longueur;
    public int largeur;

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
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

    /**
     * get field
     *
     * @return largeur
     */
    public int getLargeur() {
        return this.largeur;
    }

    /**
     * set field
     *
     * @param largeur
     */
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
}
