package utils;

import fr.diginamic.operations.CalculMoyenne;

public class AddToArrayFactory {


    public CalculMoyenne add_element(int n, double[] myarray, double ele)
    {
        int i;

        double newArray[] = new double[n + 1];
        //copy original array into new array
        for (i = 0; i <myarray.length; i++){
        newArray[i] = myarray[i];
    }

        //add element to the new array
        newArray[n] = ele;

        return new CalculMoyenne(newArray);
    }
}
