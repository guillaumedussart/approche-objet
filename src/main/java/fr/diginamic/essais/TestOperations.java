package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        Operations operation = new Operations();
        System.out.println(operation.calcul(1,5,'+'));
        System.out.println(operation.calcul(1,5,'-'));
        System.out.println(operation.calcul(1,5,'*'));
        System.out.println(operation.calcul(1,5,'/'));
    }
}
