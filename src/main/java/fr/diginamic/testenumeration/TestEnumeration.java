package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        Saison[] saisons = Saison.values();
        for (Saison saison : saisons) {
            System.out.println(saison);
        }
        System.out.println(Saison.getSaison("Ete"));
    }
}
