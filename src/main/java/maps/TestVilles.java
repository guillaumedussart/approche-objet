package maps;

import java.util.HashMap;
import java.util.Iterator;

public class TestVilles {
    public static void main(String[] args){
        HashMap<Integer,Villes> mapVilles =new HashMap<>();
        mapVilles.put(13,new Villes("Marseille"));
        mapVilles.put(34,new Villes("Montpellier"));
        mapVilles.put(44,new Villes("Nantes"));
        mapVilles.put(75,new Villes("Paris"));
        mapVilles.put(31,new Villes("Toulouse"));
        mapVilles.put(59,new Villes("Lille"));
        mapVilles.put(69,new Villes("Lyon"));
        mapVilles.put(30,new Villes("Bordeau"));

        Iterator<Integer> dept = mapVilles.keySet().iterator();
        while (dept.hasNext()){
            System.out.println(dept.next());
        }
        Iterator<Villes> name = mapVilles.values().iterator();
        while (name.hasNext()){
            System.out.println(name.next().getNomDep());
        }
        System.out.println("il y a "+mapVilles.size()+" villes");
    }
}
