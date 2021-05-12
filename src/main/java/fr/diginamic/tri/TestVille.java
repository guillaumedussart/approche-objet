package fr.diginamic.tri;


import fr.diginamic.tri.comparator.ComparatorVilleName;
import fr.diginamic.tri.comparator.ComparatorVilleNbHab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TestVille {
    public static void main(String[] args) {
        HashMap<Integer, Villes> listVilles = new HashMap<>();
        listVilles.put(1,new Villes("Nord", 120_000));
        listVilles.put(2,new Villes("Pas-de-calais", 127_000));
        listVilles.put(3,new Villes("Gard", 128_000));
        //System.out.println(listVilles.values());
        ArrayList<Villes> listVille = new ArrayList<>(listVilles.values());
        Collections.sort(listVille, new ComparatorVilleName());

        for (Villes v : listVille) {
            System.out.println(v.nbHab+" "+v.getNomDep());
        }
        Collections.sort(listVille, new ComparatorVilleNbHab());

        for (Villes vi : listVille) {
            System.out.println(vi.nbHab+" "+vi.getNomDep());
        }
    }
}
