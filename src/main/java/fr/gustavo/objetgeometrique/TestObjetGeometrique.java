package fr.gustavo.objetgeometrique;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] objetGeometriques = {
                new Cercle(25),
                new Rectangle(5, 6)
        };
        for (int i =0;i<objetGeometriques.length;i++){
            System.out.println(objetGeometriques[i]);
        }
    }

}
