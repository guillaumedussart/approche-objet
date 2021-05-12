package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Region;
import fr.diginamic.recensement.services.comparators.ComparatorRegion;

import java.util.*;

public class RechercheVilleMaxPopulationByRegion extends MenuService {


    @Override
    public void traiter(List<Recensement> recensements, Scanner scanner) {
        System.out.println("Choix de la region :");
        Region region;
        Integer choice = Integer.valueOf(scanner.next());

        List<Region> villesReg = new ArrayList<>();

        for (Recensement rec : recensements) {

            if (rec.getCodeRegion().equals(choice)) {

                region = new Region(rec.getNomCommune(), rec.getCodeRegion(), rec.getPopulationTotale());
                villesReg.add( region);
            }

        }
        ArrayList<Region> deptArray = new ArrayList<>(villesReg);
        Collections.sort(deptArray, new ComparatorRegion());
        if(deptArray.size()>0) {
            for (int i = 0; i < 10; i++) {
                region = deptArray.get(i);
                System.out.println(region.getNom() + " : " + region.getPopulation() + " habitants.");
            }
        }

    }
}
