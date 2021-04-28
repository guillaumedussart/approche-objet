package fr.diginamic.banque.entites;

import java.util.Date;

public class Credit extends Operation {
    double credit;

    public Credit(Date date, double amount, double credit) {
        super(date, amount);
        this.credit = credit;
    }

    public double calcul() {
        double calcul = this.amount + this.credit;
        return calcul;
    }

    @Override
    public String getType() {
        return "CREDIT";
    }

    /**
     * get field
     *
     * @return credit
     */
    public double getCredit() {
        return this.credit;
    }

    /**
     * set field
     *
     * @param credit
     */
    public void setCredit(double credit) {
        this.credit = credit;
    }
}
