package fr.diginamic.banque.entites;

import java.util.Date;

public class Debit extends Operation {
    double debit;

    public Debit(Date date, double amount, double debit) {
        super(date, amount);
        this.debit = debit;
    }

    public double calcul() {
        double calcul = this.amount - this.debit;
        return calcul;
    }

    @Override
    public String getType() {
        return "DEBIT";
    }


    /**
     * get field
     *
     * @return debit
     */
    public double getDebit() {
        return this.debit;
    }

    /**
     * set field
     *
     * @param debit
     */
    public void setDebit(double debit) {
        this.debit = debit;
    }
}
