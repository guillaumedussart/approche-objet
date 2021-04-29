package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
   public static void main(String[] args){
       Theatre theatre1 = new Theatre("TheaT",20,10,0);
       Theatre theatre2 = new Theatre("TheaT1",200,100,0);
       Theatre theatre3 = new Theatre("TheaT2",200,200,0);
       Theatre theatre4 = new Theatre("TheaT3",80,79,0);

       theatre1.inscrire(12,50.0);
       theatre2.inscrire(300,50.0);
       theatre3.inscrire(600,50.0);
       theatre4.inscrire(50,50.0);
   }
}
