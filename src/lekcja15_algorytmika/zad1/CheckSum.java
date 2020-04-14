package lekcja15_algorytmika.zad1;

import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {
        int sum = getSum();
        printOddOrEven(sum);
    }

    private static void printOddOrEven(int sum) {
        int mod = sum % 2;
        if(mod == 0) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }
    }

    private static int getSum() {
        int sum = 0;
        int next = 0;
        Scanner scanner = new Scanner(System.in);
        while((next = scanner.nextInt()) <= 100) {
            sum += next;
        }
        return sum;
    }
}
