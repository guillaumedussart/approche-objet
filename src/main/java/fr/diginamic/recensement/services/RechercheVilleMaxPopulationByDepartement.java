package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entities.Departement;
import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.services.comparators.ComparatorDepartement;

import java.util.*;

public class RechercheVilleMaxPopulationByDepartement extends MenuService {


    @Override
    public void traiter(List<Recensement> recensements, Scanner scanner) {
        System.out.println("Choix du departement :");
        Departement dept;
        Integer choice = Integer.valueOf(scanner.next());

        List< Departement> villesDept = new ArrayList<>() {
        };

        for (Recensement rec : recensements) {

            if (rec.getCodeDept().equals(String.valueOf(choice))) {

                Departement departement = new Departement(rec.getNomCommune(), rec.getCodeDept(), rec.getPopulationTotale());
                villesDept.add( departement);
            }

        }
        ArrayList<Departement> deptArray = new ArrayList<>(villesDept);
        Collections.sort(deptArray, new ComparatorDepartement());
        if(deptArray.size()>0) {
            for (int i = 0; i < 10; i++) {
                dept = deptArray.get(i);
                System.out.println(dept.getNom() + " : " + dept.getPopulation() + " habitants.");
            }
        }

    }
}
