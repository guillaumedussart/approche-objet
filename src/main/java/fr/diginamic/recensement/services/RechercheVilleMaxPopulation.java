package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;
import fr.diginamic.recensement.services.comparators.ComparatorVille;

import java.util.*;

public class RechercheVilleMaxPopulation extends MenuService {


    @Override
    public void traiter(List<Recensement> recensements, Scanner scanner) {
        int populationVille = 0;

        HashMap<Integer, Ville> mapVille = new HashMap<>();
        for (Recensement v : recensements) {
            Recensement recensement = v;
            Integer codeRegion = recensement.getCodeRegion();
            Ville ville = mapVille.get(codeRegion);
            if (ville == null) {
                ville = new Ville(recensement.getNomCommune(), recensement.getCodeCommune(), recensement.getPopulationTotale());
                mapVille.put(codeRegion,ville);
            } else {
                populationVille = ville.getPopulation();
                ville.setPopulation(populationVille);
            }
        }
        ArrayList<Ville> listeVille = new ArrayList<>(mapVille.values());
        Collections.sort(listeVille, new ComparatorVille());
        for (int i = 0; i < 10; i++) {
            System.out.println(listeVille.get(i));
        }
    }
}
