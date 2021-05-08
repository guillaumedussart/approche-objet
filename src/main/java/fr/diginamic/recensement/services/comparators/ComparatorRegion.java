package fr.diginamic.recensement.services.comparators;

import fr.diginamic.recensement.entities.Region;

import java.util.Comparator;

public class ComparatorRegion implements Comparator<Region> {


    @Override
    public int compare(Region o1, Region o2) {
        if(o2.getPopulation() > o1.getPopulation()){
            return 1;
        }else if(o2.getPopulation()< o1.getPopulation()){
            return -1;
        }
        return 0;
    }


}
