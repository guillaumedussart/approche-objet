package fr.diginamic.banque.entites;

import java.util.Date;

public abstract class Operation {
    Date date;
    double amount;

    public Operation(Date date, double amount) {
        this.date = date;
        this.amount = amount;
    }
    public abstract double calcul();
    public abstract String getType();
}
