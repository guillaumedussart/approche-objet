package fr.diginamic.banque.entites;


public class TestBanque {
//https://examiner.evalbox.com/register/exam/code/WBRESDF4M6K4


    public static void main(String[] args){
        Compte compteTest = new Compte("125",369);
        CompteTaux comptetaux = new CompteTaux("Un125",596,25.0);

        Object[] objectCompte = {compteTest,comptetaux};
        for (int i =0;i<objectCompte.length;i++){
            System.out.println(objectCompte[i]);
        }
    }
}
