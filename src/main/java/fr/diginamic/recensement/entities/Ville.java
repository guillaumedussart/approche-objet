package fr.diginamic.recensement.entities;

public class Ville {
    String nom;
    Integer code;
    Integer population;

    public Ville(String nom, Integer code, Integer population) {
        this.nom = nom;
        this.code = code;
        this.population = population;
    }

    @Override
    public String toString() {
        return "la ville "+getNom()+" {" +
                "code=" + getCode() +
                ", population=" + getPopulation() +
                '}';
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
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * set field
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * get field
     *
     * @return population
     */
    public Integer getPopulation() {
        return this.population;
    }

    /**
     * set field
     *
     * @param population
     */
    public void setPopulation(Integer population) {
        this.population = population;
    }
}
