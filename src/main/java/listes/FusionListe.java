package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String[] args) {
        List<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        ArrayList<String> combined = new ArrayList<>();

        for(int i=0;i<liste1.size();i++){
            combined.add(liste1.get(i));
        }
        for(int i=0;i<liste2.size();i++){
            combined.add(liste2.get(i));
        }
        System.out.println(combined);
    }

}
