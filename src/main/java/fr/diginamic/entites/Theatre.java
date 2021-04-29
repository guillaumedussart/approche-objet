package fr.diginamic.entites;

public class Theatre {
    String nom;
    int maxclient;
    int totalclient;
    int recettetotal;

    public Theatre(String nom, int maxclient, int totalclient, int recettetotal) {
        this.nom = nom;
        this.maxclient = maxclient;
        this.totalclient = totalclient;
        this.recettetotal = recettetotal;
    }

    public void inscrire(int client, double prix) {
        if (client < maxclient) {
            client = totalclient;
        }
        if (client >= maxclient) {
            System.out.println("Le nombre max de client (" + maxclient + ") est atteint");
        }
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
        return this.recettetotal;
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
