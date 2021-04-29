package fr.diginamic.operations;

public class Operations {
    double a;
    double b;
    char operator;

    public double calcul(double a, double b, char operator) {
        double calc = 0;
        if (operator == '+') {
            calc = a + b;
        } else if (operator == '-') {
            calc = a - b;
        } else if (operator == '/') {
            calc = a / b;
        } else if (operator == '*') {
            calc = a * b;
        }
        return calc;
    }
}
