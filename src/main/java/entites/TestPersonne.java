package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args){
        Personne p1 = new Personne();
        AdressePostale ap1 = new AdressePostale();

        ap1.nameOfTheWay = "tset";
        ap1.numberStreet = 22;
        ap1.city = "folie";
        ap1.postalCode = 55555;

        p1.lastName = "Jimmy";
        p1.firstName = "Test";
        p1.adp = ap1;
    }
}
