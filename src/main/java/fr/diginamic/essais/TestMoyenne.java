package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;
import utils.AddToArrayFactory;

public class TestMoyenne {

    public static void main(String[] args){
        double[] arraydouble ={10.0,6.0,6.0};
        AddToArrayFactory calcul = new AddToArrayFactory();
        System.out.println(calcul.add_element(3,arraydouble,3.0));
    }
}
