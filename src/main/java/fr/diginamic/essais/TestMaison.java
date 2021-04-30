package fr.diginamic.essais;

import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.pieces.Chambre;
import fr.diginamic.maison.pieces.SalleDeBain;
import fr.diginamic.maison.pieces.WC;

public class TestMaison {
    public static void main(String[] args){
        Maison maison = new Maison();
        maison.ajouterPiece(new WC(1,40));
        maison.ajouterPiece(new Chambre(1,20));
        maison.ajouterPiece(new Chambre(1,30));
        maison.ajouterPiece(new SalleDeBain(0,50));
        System.out.println(maison);
        System.out.println("Au nivea 0 la superficie est de "+maison.getSuperficieParEtage(0));
        System.out.println("Au nivea 1 la superficie est de "+maison.getSuperficieParEtage(1));
        System.out.println("La superficie des Wc "+maison.getSuperficieParTypePiece("WC"));
        System.out.println("La superficie des Salle sde bain "+maison.getSuperficieParTypePiece("SalleDeBain"));
        System.out.println("Le nombre de chambre est de "+maison.getNbPiecesParTypePiece("Chambre"));
        System.out.println("Le nombre de wc est de "+maison.getNbPiecesParTypePiece("WC"));
    }
}
