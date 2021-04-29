package fr.diginamic.formes;

public class Cercle extends Forme
{
    public int rayon;

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerSurface()
    {
        return Math.PI*(getRayon()*getRayon());
    }

    @Override
    public double calculerPerimetre()
    {
        return 2*Math.PI*getRayon();
    }

    /**
     * get field
     *
     * @return rayon
     */
    public int getRayon() {
        return this.rayon;
    }

    /**
     * set field
     *
     * @param rayon
     */
    public void setRayon(int rayon) {
        this.rayon = rayon;
    }
}
