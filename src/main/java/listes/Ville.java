package listes;

import java.util.*;

public class Ville {
    String nom;
    Integer nbHab;

    public Ville(String nom, Integer nbHab) {
        this.nom = nom;
        this.nbHab = nbHab;
    }

    @Override
    public String toString() {
        return getNom() + " avec " + getNbHab()+" habitants";
    }


    public static <K, V> K getSingleKeyFromValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
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
}
