package maps;

public class Pays {
    String nom;
    Integer nbHab;
    String continent;

    public Pays(String nom, Integer nbHab, String continent) {
        this.nom = nom;
        this.nbHab = nbHab;
        this.continent = continent;
    }

    /**
     * get field
     *
     * @return nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * set field
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * get field
     *
     * @return nbHab
     */
    public Integer getNbHab() {
        return this.nbHab;
    }

    /**
     * set field
     *
     * @param nbHab
     */
    public void setNbHab(Integer nbHab) {
        this.nbHab = nbHab;
    }

    /**
     * get field
     *
     * @return continent
     */
    public String getContinent() {
        return this.continent;
    }

    /**
     * set field
     *
     * @param continent
     */
    public void setContinent(String continent) {
        this.continent = continent;
    }
}
