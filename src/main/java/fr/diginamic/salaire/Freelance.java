package fr.diginamic.salaire;

public class Freelance extends Intervenant {
    int numberWorkDay;
    double dailyAmountOfRemuneration;

    public Freelance(String lastname, String firstname, int numberWorkDay, double dailyAmountOfRemuneration) {
        this.numberWorkDay = numberWorkDay;
        this.dailyAmountOfRemuneration = dailyAmountOfRemuneration;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public double getSalary() {
        return getNumberWorkDay() * getDailyAmountOfRemuneration();
    }

    @Override
    public String getContractType() {
        return "Freelance";
    }

    @Override
    public String displayData() {

        return this.lastname + " " + this.firstname + " " + getSalary() + " " + getContractType();
    }




    /**
     * get field
     *
     * @return numberWorkDay
     */
    public int getNumberWorkDay() {
        return this.numberWorkDay;
    }

    /**
     * set field
     *
     * @param numberWorkDay
     */
    public void setNumberWorkDay(int numberWorkDay) {
        this.numberWorkDay = numberWorkDay;
    }

    /**
     * get field
     *
     * @return dailyAmountOfRemuneration
     */
    public double getDailyAmountOfRemuneration() {
        return this.dailyAmountOfRemuneration;
    }

    /**
     * set field
     *
     * @param dailyAmountOfRemuneration
     */
    public void setDailyAmountOfRemuneration(double dailyAmountOfRemuneration) {
        this.dailyAmountOfRemuneration = dailyAmountOfRemuneration;
    }

    @Override
    public String toString() {
        return "Freelance{" +
                "numberWorkDay=" + getNumberWorkDay() +
                ", dailyAmountOfRemuneration=" + getDailyAmountOfRemuneration() +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
