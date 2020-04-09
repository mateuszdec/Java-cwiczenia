package Krzysiek.zad1;

import java.util.Scanner;

public class Szereg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double eps = 0.1;
        double s1 = 0.0;
        double s2 = 0.0;
        double k = 1;
        double valueOfSeries;

        System.out.println("Podaj wartość eps: ");
//        eps = scanner.nextDouble();

        do {

            s1 = 4 * ((Math.pow((-1), (k + 1))) * 1 / (2 * k - 1));
            valueOfSeries = 1 / (2 * k - 1);
            k++;
        } while (valueOfSeries > eps);

        System.out.println("Suma szerego jest równa " + s1);
    }
}
