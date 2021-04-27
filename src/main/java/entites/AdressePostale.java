package entites;

public class AdressePostale {

    public int numberStreet;
    public String nameOfTheWay;
    public int postalCode;
    public String city;

    public AdressePostale(int numberStreet, String nameOfTheWay, int postalCode, String city) {
        this.numberStreet = numberStreet;
        this.nameOfTheWay = nameOfTheWay;
        this.postalCode = postalCode;
        this.city = city;
    }

    public int getNumberStreet() {
        return numberStreet;
    }

    public String getNameOfTheWay() {
        return nameOfTheWay;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setNumberStreet(int numberStreet) {
        this.numberStreet = numberStreet;
    }

    public void setNameOfTheWay(String nameOfTheWay) {
        this.nameOfTheWay = nameOfTheWay;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
