package entites2;

import entites.AdressePostale;

import java.util.Locale;

public class Personne {

    public String lastName;
    public String firstName;
    public AdressePostale adp;

    public Personne(String lastName, String firstName, AdressePostale adp) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.adp = adp;
    }


    /**
     * get field
     *
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * set field
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get field
     *
     * @return firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * get field
     *
     * @return firstName
     */
    public String getFirstUpperName() {
        String upperFirstname = this.firstName.toUpperCase();
        return upperFirstname;
    }

    /**
     * set field
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * get field
     *
     * @return adp
     */
    public AdressePostale getAdp() {
        return this.adp;
    }

    /**
     * set field
     *
     * @param adp
     */
    public void setAdp(AdressePostale adp) {
        this.adp = adp;
    }
}
