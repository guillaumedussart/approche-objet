package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entities.Recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {


    @Override
    public void traiter(List<Recensement> recensements, Scanner scanner) {
        System.out.println("Choisissez votre ville");
        String choice = String.valueOf(scanner.next());
        System.out.println(choice);
        for (Recensement v : recensements) {
            if (v.getNomCommune().contains(choice)) {
                System.out.println("La commune de " + v.getNomCommune() + " a " + v.getPopulationTotale() + " habitants");
            }
        }
    }
}
