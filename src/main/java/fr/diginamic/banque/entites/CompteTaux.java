package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

    double remuneration;

    public CompteTaux(String accountNumber, double soldNumber,double remuneration) {
        super(accountNumber, soldNumber);
        this.remuneration = remuneration;
    }

    @Override
    public String toString() {
        return super.toString()+" "+ this.remuneration;
    }

    /**
     * get field
     *
     * @return remuneration
     */
    public double getRemuneration() {
        return this.remuneration;
    }

    /**
     * set field
     *
     * @param remuneration
     */
    public void setRemuneration(double remuneration) {
        this.remuneration = remuneration;
    }
}
