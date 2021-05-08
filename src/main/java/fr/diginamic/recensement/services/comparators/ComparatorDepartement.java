package fr.diginamic.recensement.services.comparators;

import fr.diginamic.recensement.entities.Departement;

import java.util.Comparator;

public class ComparatorDepartement implements Comparator<Departement> {


    @Override
    public int compare(Departement o1, Departement o2) {
        if(o2.getPopulation() > o1.getPopulation()){
            return 1;
        }else if(o2.getPopulation()< o1.getPopulation()){
            return -1;
        }
        return 0;
    }


}
