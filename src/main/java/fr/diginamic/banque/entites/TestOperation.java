package fr.diginamic.banque.entites;

import java.util.Date;

public class TestOperation {

    public static void main(String[] args) {
        Operation[] debits = {
                new Debit(new Date(), 500.0, 50.0),
                new Debit(new Date(), 1500.0, 250.0),
                new Credit(new Date(), 500.0, 50.0),
                new Credit(new Date(), 1500.0, 250.0),
        };
        for (int i=0;i<debits.length;i++){
            System.out.println(debits[i].date);
            System.out.println(debits[i].amount);
            System.out.println(debits[i].getType());
            System.out.println(debits[i].calcul());
        }
    }
}
