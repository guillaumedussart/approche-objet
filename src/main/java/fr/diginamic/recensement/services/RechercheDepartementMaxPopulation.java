package fr.diginamic.recensement.services;

import fr.diginamic.recensement.entities.Departement;
import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.services.comparators.ComparatorDepartement;

import java.util.*;

public class RechercheDepartementMaxPopulation extends MenuService {


    @Override
    public void traiter(List<Recensement> recensements, Scanner scanner) {
        int populationDepartement = 0;

        HashMap<String, Departement> mapDepartement = new HashMap<>();
        for (Recensement v : recensements) {
            Recensement recensement = v;
            String codeDept = recensement.getCodeDept();
            Departement dept = mapDepartement.get(codeDept);
            if (dept == null) {
                dept = new Departement(recensement.getNomRegion(), recensement.getCodeDept(), recensement.getPopulationTotale());
                mapDepartement.put(codeDept,dept);
            } else {
                populationDepartement = dept.getPopulation() + recensement.getPopulationTotale();
                dept.setPopulation(populationDepartement);
            }
        }
        ArrayList<Departement> listeRegion = new ArrayList<>(mapDepartement.values());
        Collections.sort(listeRegion, new ComparatorDepartement());
        for (int i = 0; i < 10; i++) {
            System.out.println(listeRegion.get(i));
        }
    }
}
