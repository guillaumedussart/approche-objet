package listes;

public enum Continent {
    AFRIQUE("Afrique",1_340_598_000),
    AMERIQUE("Amerique",653_962_000),
    ASIE("Asie",641_055_000),
    EUROPE("Europe",747_636_000),
    OCEANIE("Oceanie",42_678_000);

    private String libelle;
    private Integer population;


    Continent(String libelle, Integer population) {
        this.libelle = libelle;
        this.population = population;
    }

    /**
     * get field
     *
     * @return libelle
     */
    public String getLibelle() {
        return this.libelle;
    }

    /**
     * set field
     *
     * @param libelle
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
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
