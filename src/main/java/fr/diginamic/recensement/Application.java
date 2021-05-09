package fr.diginamic.recensement;

import fr.diginamic.recensement.entities.Recensement;
import fr.diginamic.recensement.services.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static files.ManipulationFichier.strToInt;

public class Application {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        List<Recensement> listRecensements = setCounrtyArray("/home/guillaume/workspace/approche-objet/src/main/resources/files/recensement.csv");




        int menuOption = displayMenu(scanner);

        do {

            switch (menuOption) {
                case 1:
                    RecherchePopulationVille recherche = new RecherchePopulationVille();
                    System.out.println("______________________________________________");
                    recherche.traiter(listRecensements, scanner);
                    System.out.println("______________________________________________");

                    displayMenu(scanner);

                    break;
                case 2:
                    RecherchePopulationByDepartement rechercheD = new RecherchePopulationByDepartement();
                    System.out.println("______________________________________________");

                    rechercheD.traiter(listRecensements, scanner);
                    System.out.println("______________________________________________");

                    displayMenu(scanner);
                    break;
                case 3:
                    RecherchePopulationByRegion rechercheR = new RecherchePopulationByRegion();
                    System.out.println("______________________________________________");

                    rechercheR.traiter(listRecensements, scanner);
                    System.out.println("______________________________________________");

                    displayMenu(scanner);
                    break;
                case 4:
                    RechercheRegionMaxPopulation rechercheRm = new RechercheRegionMaxPopulation();
                    System.out.println("______________________________________________");

                    rechercheRm.traiter(listRecensements, scanner);
                    System.out.println("______________________________________________");

                    displayMenu(scanner);
                    break;
                case 5:
                    RechercheDepartementMaxPopulation rechercheDm = new RechercheDepartementMaxPopulation();
                    System.out.println("______________________________________________");

                    rechercheDm.traiter(listRecensements, scanner);
                    System.out.println("______________________________________________");

                    displayMenu(scanner);
                    break;
                case 6:
                    RechercheVilleMaxPopulation rechercheVm = new RechercheVilleMaxPopulation();
                    System.out.println("______________________________________________");

                    rechercheVm.traiter(listRecensements, scanner);
                    System.out.println("______________________________________________");

                    displayMenu(scanner);
                    break;
                case 7:
                    RechercheVilleMaxPopulationByDepartement rechercheVmd = new RechercheVilleMaxPopulationByDepartement();
                    System.out.println("______________________________________________");

                    rechercheVmd.traiter(listRecensements, scanner);
                    System.out.println("______________________________________________");

                    displayMenu(scanner);
                case 8:
                    RechercheVilleMaxPopulationByRegion rechercheVmr = new RechercheVilleMaxPopulationByRegion();
                    System.out.println("______________________________________________");

                    rechercheVmr.traiter(listRecensements, scanner);
                    System.out.println("______________________________________________");

                    displayMenu(scanner);
                    break;
                default:
                    break;
            }

        }
        while (menuOption < 9);
    }


    public static ArrayList<Recensement> setCounrtyArray(String file) throws IOException {

        Path recensements = Paths.get(file);


        if (Files.exists(recensements) && Files.isReadable(recensements)) {
            List<String> lines = Files.readAllLines(recensements, StandardCharsets.UTF_8);
            Iterator<String> fileIte = lines.iterator();
            fileIte.next();
            ArrayList<Recensement> villes = new ArrayList<>();
            while (fileIte.hasNext()) {
                String[] splitFile = fileIte.next().split(";");
                String population = splitFile[9];
                String replace = population.replace(" ", "");
                int integerPopulation = strToInt(replace);

                int deptList = Integer.parseInt(splitFile[0]);
                String codeDept = splitFile[2];
                int codeCommune = Integer.parseInt(splitFile[5]);
                int populationReplace = Integer.parseInt(String.valueOf(integerPopulation));

                Recensement recensement = new Recensement(deptList, splitFile[1], codeDept, codeCommune, splitFile[6], populationReplace);

                villes.add(recensement);
            }
            return villes;
        }
        return null;
    }

    public static int displayMenu(Scanner scanner) {
        int menuOption;

        System.out.println("TP Recensement.");
        System.out.println("Faites votre choix :");
        System.out.println("1. Population d’une ville donnée");
        System.out.println("2. Population d’un département donné");
        System.out.println("3. Population d’une région donnée");
        System.out.println("4. Afficher les 10 régions les plus peuplées de France");
        System.out.println("5. Afficher les 10 départements les plus peuplés de France");
        System.out.println("6. Afficher les 10 villes les plus peuplées de France");
        System.out.println("7. Afficher les 10 villes les plus peuplées d’un département");
        System.out.println("8. Afficher les 10 villes les plus peuplées d’une région");
        System.out.println("9. Sortir");

        menuOption = Integer.parseInt(scanner.next());
        return menuOption;
    }

}