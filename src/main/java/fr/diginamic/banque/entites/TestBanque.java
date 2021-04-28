package fr.diginamic.banque.entites;


public class TestBanque {
//https://examiner.evalbox.com/register/exam/code/WBRESDF4M6K4


    public static void main(String[] args){
        Compte compte1 = new Compte("125",369);
        CompteTaux compte2 = new CompteTaux("Un125",596,25.0);

        Object[] objectCompte = {compte1,compte2};
        for (int i =0;i<objectCompte.length;i++){
            System.out.println(objectCompte[i]);
        }
    }
}
