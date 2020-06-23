package zadania.lekcja2_tabliceISterowanie.precyzjaLiczb;

import java.math.BigDecimal;
import java.util.Scanner;

public class NumberReader2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        double n = scan.nextInt();
        scan.close();
        BigDecimal limit = BigDecimal.valueOf(n);
        if(n > 0)
            for (BigDecimal i = BigDecimal.ZERO; i.compareTo(limit) <= 0; i = i.add(BigDecimal.valueOf(0.1)))
                System.out.print(i.toString() + " ");
        else if(n < 0)
            for (BigDecimal i = BigDecimal.ZERO; i.compareTo(limit) >= 0; i = i.subtract(BigDecimal.valueOf(0.1)))
                System.out.print(i.toString() + " ");
    }
}
