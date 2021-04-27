package entites;

import entites2.Personne;

public class TestPersonne {


    public TestPersonne() {
    }

    public static void main(String[] args) {
        AdressePostale ap1 = new AdressePostale(22, "testCx", 55555, "testCxv");
        Personne p1 = new Personne("Jimmy", "Test", ap1);
    }
}
