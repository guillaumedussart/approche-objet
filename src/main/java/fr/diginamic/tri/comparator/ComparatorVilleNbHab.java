package fr.diginamic.tri.comparator;

import fr.diginamic.tri.Villes;

import java.util.Comparator;

public class ComparatorVilleNbHab implements Comparator<Villes> {
    @Override
    public int compare(Villes o1, Villes o2) {
        return o1.getNbHab() - o2.getNbHab();
    }
}
