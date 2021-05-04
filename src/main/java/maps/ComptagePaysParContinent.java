package maps;

import java.util.*;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        Map<String, Pays> pays = new HashMap<>();
        pays.put("France",new Pays("France", 65_000_000, "Europe"));
        pays.put("Allemagne",new Pays("Allemagne", 80_000_000, "Europe"));
        pays.put("Belgique",new Pays("Belgique", 10_000_000, "Europe"));
        pays.put("Russie",new Pays("Russie", 150_000_000, "Asie"));
        pays.put("Chine",new Pays("Chine", 1_400_000_000, "Asie"));
        pays.put("Indonesie",new Pays("Indonesie", 220_000_000, "Oceanie"));
        pays.put("Australie",new Pays("Australie", 20_000_000, "Oceanie"));



        HashMap<String, Integer> comptage = new HashMap<>();

        Iterator<Pays> iterPays = pays.values().iterator();
        while (iterPays.hasNext()) {
            Pays paysIt = iterPays.next();

            String continent = paysIt.getContinent();
            Integer compteur = comptage.get(continent);

            if (compteur==null) {
                comptage.put(continent, 1);
            }
            else {
                compteur++;
                comptage.put(continent, compteur);
            }
        }

        System.out.println(comptage);

    }

}
