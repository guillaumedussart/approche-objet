package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entities.Region;
import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.services.comparators.ComparatorRegion;

import java.util.*;

public class RechercheRegionMaxPopulation extends MenuService {


    @Override
    public void traiter(List<Recensement> recensements, Scanner scanner) {
        int populationRegion = 0;

        HashMap<Integer, Region> mapRegion = new HashMap<>();
        for (Recensement v : recensements) {
            Recensement recensement = v;
            Integer codeRegion = recensement.getCodeRegion();
            Region region = mapRegion.get(codeRegion);
            if (region == null) {
                region = new Region(recensement.getNomRegion(), recensement.getCodeRegion(), recensement.getPopulationTotale());
                mapRegion.put(codeRegion, region);
            } else {
                populationRegion = region.getPopulation() + recensement.getPopulationTotale();
                region.setPopulation(populationRegion);
            }
        }
        ArrayList<Region> listeRegion = new ArrayList<>(mapRegion.values());
        Collections.sort(listeRegion, new ComparatorRegion());
        for (int i = 0; i < 10; i++) {
            System.out.println(listeRegion.get(i));
        }
    }
}
