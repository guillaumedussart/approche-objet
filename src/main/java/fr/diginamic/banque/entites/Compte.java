package fr.diginamic.banque.entites;

public class Compte {
    public int accountNumber;
    public int soldNumber;
    public Compte(int accountNumber, int soldNumber) {
        this.accountNumber = accountNumber;
        this.soldNumber = soldNumber;
    }
    @Override
    public String toString() {
        return this.accountNumber +" "+this.soldNumber;
    }
}
