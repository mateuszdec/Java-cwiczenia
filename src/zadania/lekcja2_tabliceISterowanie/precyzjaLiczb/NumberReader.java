package zadania.lekcja2_tabliceISterowanie.precyzjaLiczb;

import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        double n = scan.nextInt();
        scan.close();
        if(n > 0)
            for (double i = 0; i < (n + 0.1); i+=0.1)
                System.out.printf("%.1f ", i);
        else if(n < 0)
            for (double i = 0; i > (n - 0.1); i-=0.1)
                System.out.printf("%.1f ", i);
    }
}
