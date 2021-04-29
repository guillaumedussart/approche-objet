package fr.diginamic.entites;

import org.apache.logging.log4j.util.Strings;

import static org.springframework.util.StringUtils.replace;

public class Salarie {
    String nom;
    String prenom;
    double salaire;

    public Salarie(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public double transform(double chaine) {
        Double varDouble = chaine;
        String s = varDouble.toString();
        String sReplace = s.replace(" ", "");
        return Double.parseDouble(sReplace);
    }

    /**
     * get field
     *
     * @return nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * set field
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * get field
     *
     * @return prenom
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * set field
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * get field
     *
     * @return salaire
     */
    public double getSalaire() {
        return this.salaire;
    }

    /**
     * set field
     *
     * @param salaire
     */
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
