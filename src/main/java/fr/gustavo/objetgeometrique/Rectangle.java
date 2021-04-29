package fr.gustavo.objetgeometrique;

public class Rectangle implements ObjetGeometrique {
    double longueur;
    double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return longueur * 2 + largeur * 2;
    }

    @Override
    public double surface() {
        return largeur * longueur;
    }
    @Override
    public String toString() {
        return "Le perimetre du rectangle est "+ this.perimetre()+" et sa surface est "+this.surface();
    }
    /**
     * get field
     *
     * @return longueur
     */
    public double getLongueur() {
        return this.longueur;
    }

    /**
     * set field
     *
     * @param longueur
     */
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    /**
     * get field
     *
     * @return largeur
     */
    public double getLargeur() {
        return this.largeur;
    }

    /**
     * set field
     *
     * @param largeur
     */
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
}
