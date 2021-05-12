package listes;

import java.util.*;

public class Ville {
    Continent continent;
    String nom;
    Integer nbHab;



    public Ville(Continent continent, String nom, Integer nbHab) {
        this.continent = continent;
        this.nom = nom;
        this.nbHab = nbHab;
    }

    @Override
    public String toString() {
        return getNom() + " avec " + getNbHab() + " habitants et se trouve sur "+continent;
    }


    public static <K, V> K getSingleKeyFromValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

   /* @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if(!(anObject instanceof Ville)){
            return false;
        }
        Ville other = (Ville) anObject;
        if (this.nbHab == other.getNbHab()) {
            return true;
        }
        if (this.nom.equals(other.getNom())) {
            return true;
        }
        return false;
    }*/

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ville)) return false;
        Ville ville = (Ville) o;
        return getNom().equals(ville.getNom()) && getNbHab().equals(ville.getNbHab());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getNbHab());
    }

    /**
     * get field
     *
     * @return continent
     */
    public Continent getContinent() {
        return this.continent;
    }

    /**
     * set field
     *
     * @param continent
     */
    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
