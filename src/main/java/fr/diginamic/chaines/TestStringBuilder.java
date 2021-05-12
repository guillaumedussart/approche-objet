package fr.diginamic.chaines;

/**
 *  test string builder
 *
 */
public class TestStringBuilder {
    /**
     * main
     *
     * @param args args
     */
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();

        long debut = System.currentTimeMillis();
        for (int i=1;i<=100000;i++){
            str1.append(i+"\n");
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));


        long debut2 = System.currentTimeMillis();
        String str2 = new String();
        for (int j=1;j<=100000;j++){
            str2 = str2 + j+"\n";
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes avec conc :" + (fin2 - debut2));
    }
}
