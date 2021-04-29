package fr.gustavo.objetgeometrique;

public class Cercle implements ObjetGeometrique {
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }


    @Override
    public double perimetre() {
        return rayon *2 *3.14;
    }

    @Override
    public double surface() {
        return 3.14 * (rayon * rayon);
    }
    @Override
    public String toString() {
        return "Le perimetre du cercle est "+ this.perimetre()+" et sa surface est "+this.surface();
    }
    /**
     * get field
     *
     * @return rayon
     */
    public double getRayon() {
        return this.rayon;
    }

    /**
     * set field
     *
     * @param rayon
     */
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}
