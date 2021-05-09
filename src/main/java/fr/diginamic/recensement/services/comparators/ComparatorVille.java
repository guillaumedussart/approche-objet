package fr.diginamic.recensement.services.comparators;

import fr.diginamic.recensement.entities.Ville;

import java.util.Comparator;

public class ComparatorVille implements Comparator<Ville> {


    @Override
    public int compare(Ville o1, Ville o2) {

        if(o2.getPopulation() > o1.getPopulation()){
            return 1;
        }else if(o2.getPopulation()< o1.getPopulation()){
            return -1;
        }
        return 0;
    }


}
