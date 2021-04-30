package fr.diginamic.salaire;

public abstract class Intervenant
{
    String lastname;
    String firstname;
    public abstract double getSalary();
    public abstract String getContractType();

    public abstract String displayData();
}
