package fr.diginamic.maison;

public interface ConstruireMaison {
    public void ajouterPiece(Piece piece) ;

    public double getSuperficieTotal();

    public double getSuperficieParEtage(int etage);

    double getSuperficieParTypePiece(String type);

    int getNbPiecesParTypePiece(String type);
}
