package fr.diginamic.testenumeration;

public enum Saison {


    HIVER("Hiver", 1),
    PRINTEMPS("Printemps", 2),
    ETE("Ete", 3),
    AUTOMNE("Automne", 4);


    private String libelle;
    private Integer num;


    Saison(String libelle, Integer num) {
        this.libelle = libelle;
        this.num = num;
    }

    public static Saison getSaison(String libelle) {
        Saison[] libs = Saison.values();
        for (Saison saison : libs) {
            if (saison.getLibelle().equals(libelle)) {
                return saison;
            }
        }
        return null;
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
     * @return num
     */
    public Integer getNum() {
        return this.num;
    }

    /**
     * set field
     *
     * @param num
     */
    public void setNum(Integer num) {
        this.num = num;
    }
}
