package maps;

import listes.Ville;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapVilles {

    public static void main(String[] args) {

        Map<String, Ville> mapVilles = new HashMap<>();
        mapVilles.put("Nice", new Ville("Nice", 542_000));
        mapVilles.put("Lille", new Ville("Lille", 592_000));
        mapVilles.put("Marseille", new Ville("Marseille", 960_000));
        mapVilles.put("Toulouse", new Ville("Toulouse", 120_000));
        mapVilles.put("Montpellier", new Ville("Montpellier", 240_000));



        /*
         *
         * */
        Iterator<Ville> villeIte = mapVilles.values().iterator();
        int min = Integer.MAX_VALUE;
        Ville selected = null;
        while (villeIte.hasNext()) {
            Ville ville = villeIte.next();

            if (ville.getNbHab() < min) {
                min = ville.getNbHab();
                selected = ville;
            }

        }
        mapVilles.remove(selected.getNom());
        System.out.println(mapVilles);
        for (Ville v : mapVilles.values()) {
            System.out.println(v.getNom());
        }
    }
}
