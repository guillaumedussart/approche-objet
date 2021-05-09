package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entities.Recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationByDepartement extends MenuService {


    @Override
    public void traiter(List<Recensement> recensements, Scanner scanner) {
        System.out.println("Choix du departement :");
        String choice = String.valueOf(Integer.parseInt(scanner.next()));
        int vt = 0;
        String dept = null;
        for (Recensement v : recensements) {
            if (v.getCodeDept().equalsIgnoreCase(choice)) {
                vt += v.getPopulationTotale();
                dept= v.getNomRegion();
            }
        }
        System.out.println("Le departement " + dept + " a pour population " + vt);
    }
}
