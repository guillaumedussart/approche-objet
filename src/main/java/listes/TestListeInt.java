package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);
        System.out.println(liste);
        System.out.println("----------------------------------------------");
        System.out.println(liste.size());
        System.out.println("----------------------------------------------");

        Object objmin = Collections.min(liste);
        System.out.println(objmin);
        System.out.println("----------------------------------------------");

        liste.remove(objmin);
        System.out.println(liste);
        System.out.println("----------------------------------------------");
        Object objmax = Collections.max(liste);
        System.out.println(objmax);
        System.out.println("----------------------------------------------");
        List<Integer> listemax = new ArrayList<>();
        for (int i = 0; i < liste.size(); i++) {

            System.out.println(Math.abs(liste.get(i)));

        }
        System.out.println("----------------------------------------------");

    }
}
