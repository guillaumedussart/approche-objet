package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entities.Recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationByRegion extends MenuService {


    @Override
    public void traiter(List<Recensement> recensements, Scanner scanner) {
        System.out.println("Choix de la region :");
        int choice = Integer.parseInt(scanner.next());
        int poulationRegion = 0;
        String region = null;
        for (Recensement v : recensements) {
            if (v.getCodeRegion().equals(choice)) {
                poulationRegion += v.getPopulationTotale();
                region= v.getNomRegion();
            }
        }
        System.out.println("La region " + region + " a pour population " + poulationRegion);
    }

}
