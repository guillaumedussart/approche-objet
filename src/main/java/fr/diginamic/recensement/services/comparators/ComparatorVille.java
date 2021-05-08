package fr.diginamic.recensement.services.comparators;

import fr.diginamic.recensement.entities.Recensement;

import java.util.Comparator;

public class ComparatorVille implements Comparator<Recensement> {


    @Override
    public int compare(Recensement o1, Recensement o2) {

        if(o2.getPopulationTotale() > o1.getPopulationTotale()){
            return 1;
        }else if(o2.getPopulationTotale()< o1.getPopulationTotale()){
            return -1;
        }
        return 0;
    }

    @Override
    public Comparator<Recensement> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Recensement> thenComparing(Comparator<? super Recensement> other) {
        return Comparator.super.thenComparing(other);
    }
}
