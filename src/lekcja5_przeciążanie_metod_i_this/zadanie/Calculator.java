package lekcja5_przeciążanie_metod_i_this.zadanie;

public class Calculator {

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double subtract(double a, double b, double c) {
        return a - b - c;
    }
}
