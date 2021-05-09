package fr.diginamic.recensement.entities;

import java.util.ArrayList;
import java.util.List;

public class Recensement {
    Integer codeRegion;
    String nomRegion;
    String codeDept;
    Integer codeCommune;
    String nomCommune;
    Integer populationTotale;

    public Recensement(Integer codeRegion, String nomRegion, String codeDept, Integer codeCommune, String nomCommune, Integer populationTotale) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDept = codeDept;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.populationTotale = populationTotale;
    }
    /**
     * get field
     *
     * @return codeRegion
     */
    public Integer getCodeRegion() {
        return this.codeRegion;
    }

    /**
     * set field
     *
     * @param codeRegion
     */
    public void setCodeRegion(Integer codeRegion) {
        this.codeRegion = codeRegion;
    }

    /**
     * get field
     *
     * @return nomRegion
     */
    public String getNomRegion() {
        return this.nomRegion;
    }

    /**
     * set field
     *
     * @param nomRegion
     */
    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    /**
     * get field
     *
     * @return codeDept
     */
    public String getCodeDept() {
        return this.codeDept;
    }

    /**
     * set field
     *
     * @param codeDept
     */
    public void setCodeDept(String codeDept) {
        this.codeDept = codeDept;
    }

    /**
     * get field
     *
     * @return codeCommune
     */
    public Integer getCodeCommune() {
        return this.codeCommune;
    }

    /**
     * set field
     *
     * @param codeCommune
     */
    public void setCodeCommune(Integer codeCommune) {
        this.codeCommune = codeCommune;
    }

    /**
     * get field
     *
     * @return nomCommune
     */
    public String getNomCommune() {
        return this.nomCommune;
    }

    /**
     * set field
     *
     * @param nomCommune
     */
    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    /**
     * get field
     *
     * @return populationTotale
     */
    public Integer getPopulationTotale() {
        return this.populationTotale;
    }


}
