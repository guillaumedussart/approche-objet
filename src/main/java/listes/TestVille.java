package listes;

import java.util.*;

public class TestVille {
    public static void main(String[] args) {



        Map<String, Integer> villeHab = new HashMap<String, Integer>();
        villeHab.put("Nice", Integer.valueOf(352000));
        villeHab.put("Carcassonne", Integer.valueOf(47800));
        villeHab.put("Narbonne", Integer.valueOf(53400));
        villeHab.put("Lyon", Integer.valueOf(484000));
        villeHab.put("Pau", Integer.valueOf(77200));
        villeHab.put("Marseille", Integer.valueOf(850700));
        villeHab.put("Tarbes", Integer.valueOf(40600));
        int maxValue = Collections.max(villeHab.values());
        String max = Ville.getSingleKeyFromValue(villeHab, maxValue);
        System.out.println(max);
        System.out.println(maxValue);

        System.out.println(villeHab.values());
        int minValue = Collections.min(villeHab.values());
        String minVal = Collections.min(villeHab.keySet());


        String min = Ville.getSingleKeyFromValue(villeHab, minValue);
        villeHab.remove(minVal);
        System.out.println(min);
        System.out.println(minValue);
        System.out.println("---------------------------");
        System.out.println(villeHab);
        for (String vi : villeHab.keySet()) {
            System.out.println(vi);
        }
        if (maxValue > 100000) {
            String maxUpper = Ville.getSingleKeyFromValue(villeHab, maxValue).toUpperCase(Locale.ROOT);
            System.out.println(maxUpper);
        }


        /*
         *
         * */
        List<Ville> villeList = new ArrayList<>();
        villeList.add(new Ville(Continent.AFRIQUE,"Nice", 542_000));
        villeList.add(new Ville(Continent.AFRIQUE,"Lille", 592_000));
        villeList.add(new Ville(Continent.AFRIQUE,"Marseille", 96_000));
        villeList.add(new Ville(Continent.AFRIQUE,"Toulouse", 120_000));
        villeList.add(new Ville(Continent.AFRIQUE,"Montpellier", 240_000));
        Ville selected = villeList.get(0);
        Integer maxVal = Integer.MAX_VALUE;
        Iterator<Ville> villeIterator = villeList.iterator();
        while (villeIterator.hasNext()) {
            Ville ville = villeIterator.next();
            if (ville.getNbHab() < selected.getNbHab()) {
                selected = ville;
            }
        }
/*
        villeList.remove(selected);
*/
        System.out.println(selected);
        /*for (Ville v : villeList) {
            System.out.println(v);
        }*/
    }
}
