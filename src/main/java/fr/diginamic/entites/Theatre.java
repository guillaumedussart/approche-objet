package fr.diginamic.entites;

public class Theatre {
    String nom;
    int maxclient;
    int totalclient;
    double recettetotal;

    public Theatre(String nom, int maxclient, int totalclient,double recettetotal) {
        this.nom = nom;
        this.maxclient = maxclient;
        this.totalclient = totalclient;
        this.recettetotal = recettetotal;
    }

    public boolean inscrire(int nbclient, double prix) {
        if (nbclient < maxclient) {
            nbclient = totalclient;
            recettetotal = nbclient*prix;
            System.out.println("Le total client est "+ totalclient+" et sa recette est "+recettetotal+" pour le theatre "+nom);
        }
        if (nbclient >= maxclient) {
            System.out.println("Le nombre max de client (" + maxclient + ") est atteint pour le theatre "+nom);
            return false;
        }
        return true;
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
     * @return max
     */
    public int getMax() {
        return this.maxclient;
    }

    /**
     * set field
     *
     * @param max
     */
    public void setMax(int max) {
        this.maxclient = max;
    }

    /**
     * get field
     *
     * @return totalclient
     */
    public int getTotalclient() {
        return this.totalclient;
    }

    /**
     * set field
     *
     * @param totalclient
     */
    public void setTotalclient(int totalclient) {
        this.totalclient = totalclient;
    }

    /**
     * get field
     *
     * @return recettetotal
     */
    public int getRecettetotal() {
        return (int) this.recettetotal;
    }

    /**
     * set field
     *
     * @param recettetotal
     */
    public void setRecettetotal(int recettetotal) {
        this.recettetotal = recettetotal;
    }
}
