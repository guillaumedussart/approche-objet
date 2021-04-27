package utils;

/**
 *  conversion nombre
 *
 */
public class ConversionNombre {
    public static String chaine = "12";
    public static void main(String[] args){
        System.out.println(playInteger());
        System.out.println(diffInteger());
    }
    public static int playInteger(){
        int integer = Integer.parseInt(chaine);
        return integer;
    }
    public static int diffInteger(){
        int a = 12;
        int b = 25;
        int max = Integer.max(a,b);
        return max;
    }
}
