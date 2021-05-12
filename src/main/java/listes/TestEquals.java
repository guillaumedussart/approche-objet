package listes;

/**
 *  test equals
 *
 */
public class TestEquals {
    /**
     * main
     *
     * @param args args
     */
    public static void main(String[] args) {
        Ville ville1 = new Ville(Continent.AFRIQUE,"Nicfe",3);
        Ville ville2 = new Ville(Continent.AFRIQUE,"Nice",3);

        System.out.println(ville1.equals(ville2));
        System.out.println(ville1.hashCode());
    }
}
