package fr.diginamic.operations;

public class CalculMoyenne {
    double[] moyenne;



    public CalculMoyenne(double[] moyenne) {
        this.moyenne = moyenne;
    }
    @Override
    public String toString() {
        return "a pour moyenne :"+ this.calcul();
    }
    public float calcul(){
        System.out.println("Le tableau :");
        for (double nombre:moyenne) {
            System.out.print("[ "+nombre + " ]");
        }
        int somme = 0;
        for(int i = 0; i < moyenne.length; i++){
            somme += moyenne[i];
        }
        float moy = (float) somme / moyenne.length;

        return moy;
    }


}
