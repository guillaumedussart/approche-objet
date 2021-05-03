package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {
    public static void main(String[] args){
        List<Integer> listInteger = new ArrayList<>();
        for(int i =0 ;i<=100;i++){
            listInteger.add(i);
        }
        System.out.println(listInteger);
    }
}
