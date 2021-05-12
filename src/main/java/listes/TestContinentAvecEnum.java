package listes;

public class TestContinentAvecEnum
{
    public static void main(String[] args) {
        Ville[] villes = {
                new Ville(Continent.AFRIQUE,"Simbabouai",10_000),
                new Ville(Continent.AMERIQUE,"Washinton",100_000),
        };
        for(Ville v:villes){
            System.out.println(v);
        }
    }
}
