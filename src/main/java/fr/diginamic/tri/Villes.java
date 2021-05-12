package fr.diginamic.tri;

public class Villes {
    String nomDep;
    Integer nbHab;


    public Villes(String nomDep, Integer nbHab) {
        this.nomDep = nomDep;
        this.nbHab = nbHab;
    }

    /**
     * get field
     *
     * @return nomDep
     */
    public String getNomDep() {
        return this.nomDep;
    }

    /**
     * set field
     *
     * @param nomDep
     */
    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
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
}
