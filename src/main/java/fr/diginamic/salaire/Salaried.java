package fr.diginamic.salaire;

public class Salaried extends Intervenant {
    double monthlyPaid;
    String contractType;

    public Salaried(String lastname, String firstname, double monthlyPaid, String contractType) {
        this.monthlyPaid = monthlyPaid;
        this.contractType = contractType;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public double getSalary() {
        return getMonthlyPaid();
    }



    @Override
    public String displayData() {
        return this.lastname + " " + this.firstname + " " + getSalary() + " " + getContractType();
    }


    /**
     * get field
     *
     * @return monthlyPaid
     */
    public double getMonthlyPaid() {
        return this.monthlyPaid;
    }

    /**
     * set field
     *
     * @param monthlyPaid
     */
    public void setMonthlyPaid(double monthlyPaid) {
        this.monthlyPaid = monthlyPaid;
    }

    /**
     * get field
     *
     * @return contactType
     */

    public String getContractType() {
        return this.contractType;
    }

    /**
     * set field
     *
     * @param contractType
     */
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }
}
