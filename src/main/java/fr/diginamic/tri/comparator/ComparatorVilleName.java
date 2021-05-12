package fr.diginamic.tri.comparator;



import fr.diginamic.tri.Villes;

import java.util.Comparator;

public class ComparatorVilleName implements Comparator<Villes> {





    @Override
    public int compare(Villes v1, Villes v2) {
        return v1.getNomDep().compareTo(v2.getNomDep());
    }
}
