package maps;

import java.util.HashMap;
import java.util.Map;

public class TestCreateEmployes {
    public static void main(String[] args){
        Map<String,Employes> mapSalary = new HashMap<>();
        mapSalary.put("e001",new Employes("Tom",1200));
        mapSalary.put("e002",new Employes("Paul",1400));
        mapSalary.put("e003",new Employes("Cedric",1800));
        mapSalary.put("e004",new Employes("Roger",1700));
        System.out.println("Il y a "+mapSalary.size()+" Employes");
    }
}
