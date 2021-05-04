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
        for (String vi : villeHab.keySet()){
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
        villeList.add(new Ville("Nice",542_000));
        villeList.add(new Ville("Lille",592_000));
        villeList.add(new Ville("Marseille",960_000));
        villeList.add(new Ville("Toulouse",120_000));
        villeList.add(new Ville("Montpellier",240_000));
        Iterator<Ville> villeIterator = villeList.iterator();
        while(villeIterator.hasNext()){
            Ville ville = villeIterator.next();
            System.out.println(ville.getNbHab());
        }
    }
}
