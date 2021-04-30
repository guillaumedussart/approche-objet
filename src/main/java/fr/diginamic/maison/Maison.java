package fr.diginamic.maison;

import java.util.ArrayList;
import java.util.List;


public class Maison implements ConstruireMaison {


    private List<Piece> pieces = new ArrayList<Piece>();




    @Override
    public void ajouterPiece(Piece piece) {
        if(piece == null){
            System.out.println("Le pieces ne peuvent pas etre null");
            return;
        }
        if (piece.getLevel() < 0) {
            System.out.println("Il n'y a pas de cave !");
            return;
        }

        pieces.add(piece);
    }

    @Override
    public double getSuperficieTotal() {
        int area =0;
        for(int i =0 ;i<pieces.size();i++){
             area += pieces.get(i).getArea();
        }
        return  area;
    }

    @Override
    public double getSuperficieParEtage(int etage) {
        int level;
        int area = 0;
        for(int i =0 ;i<pieces.size();i++){
           level = pieces.get(i).getLevel();//.getClass().getSimpleName();
            if(etage == level){
                area += pieces.get(i).getArea();
            }
        }
        return area;
    }

    @Override
    public double getSuperficieParTypePiece(String type) {
        String name;
        int area = 0;
        for(int i =0 ;i<pieces.size();i++){
            name = pieces.get(i).getClass().getSimpleName();
            if(type.equals(name)){
                area = pieces.get(i).getArea();
            }
        }
        return area;
    }

    @Override
    public int getNbPiecesParTypePiece(String type) {
        String name;
        ArrayList<Integer> piece = new ArrayList<Integer>();
        int area = 0;
        for(int i =0 ;i<pieces.size();i++){
            name = pieces.get(i).getClass().getSimpleName();
            if(type.equals(name)){
                piece.add(i);
            }
        }
        return piece.size();
    }

    @Override
    public String toString() {
        return "Cette maison a " + pieces.size()+" piece"+(pieces.size() > 1 ? "s":"")+" d'une superficie totale de "+getSuperficieTotal()+" m²" ;
    }

}
