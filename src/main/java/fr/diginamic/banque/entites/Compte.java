package fr.diginamic.banque.entites;

public class Compte {

    public String accountNumber;
    public double soldNumber;


    public Compte(String accountNumber, double soldNumber) {
        this.accountNumber = accountNumber;
        this.soldNumber = soldNumber;
    }



    @Override
    public String toString() {
        return this.accountNumber +" "+this.soldNumber;
    }


    /**
     * get field
     *
     * @return accountNumber
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * set field
     *
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * get field
     *
     * @return soldNumber
     */
    public double getSoldNumber() {
        return this.soldNumber;
    }

    /**
     * set field
     *
     * @param soldNumber
     */
    public void setSoldNumber(double soldNumber) {
        this.soldNumber = soldNumber;
    }
}
