package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entities.Departement;
import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.entities.Ville;
import fr.diginamic.recensement.services.comparators.ComparatorDepartement;
import fr.diginamic.recensement.services.comparators.ComparatorVille;

import java.util.*;

public class RechercheVilleMaxPopulationByDepartement extends MenuService {


    @Override
    public void traiter(List<Recensement> recensements, Scanner scanner) {
        int populationVille = 0;
        System.out.println("Choix du departement :");

        Integer choice = Integer.valueOf(scanner.next());

        HashMap<Integer,Departement> villesDept = new HashMap<>();

        for (Recensement rec : recensements) {
            Integer codeRegion = choice;
            if (rec.getCodeDept().equalsIgnoreCase(String.valueOf(codeRegion))) {
                Departement dept = new Departement(rec.getNomCommune(),rec.getCodeDept(),rec.getPopulationTotale());
                villesDept.put(choice,dept);
            }
           /* if (ville == null) {
                System.out.println(ville);
                ville = new Ville(recensement.getNomCommune(), recensement.getCodeCommune(), recensement.getPopulationTotale());
                mapVille.put(codeRegion,ville);
            } else {
                populationVille = ville.getPopulation();
                ville.setPopulation(populationVille);
            }*/
        }
        ArrayList<Departement> deptArray = new ArrayList<>(villesDept.values());
        Collections.sort(deptArray,new ComparatorDepartement());
        if(deptArray.size()>0) {
            for (int i = 0; i < 10; i++) {
                Departement dept = deptArray.get(i);
                System.out.println(dept.getNom() + " : " + dept.getPopulation() + " habitants.");
            }
        }
        /*ArrayList<Ville> listeVille = new ArrayList<>(mapVille.values());
        Collections.sort(listeVille, new ComparatorVille());
        for (int i = 0; i < 10; i++) {
            System.out.println(listeVille.get(i));
        }*/
    }
}
