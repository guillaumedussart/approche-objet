package fr.diginamic.entites;

public class Cercle {
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double perimetre() {
        return  2 * rayon*Math.PI;
    }

    public double surface() {
        return Math.PI * rayon * rayon;
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
