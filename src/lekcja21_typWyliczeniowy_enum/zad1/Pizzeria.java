package lekcja21_typWyliczeniowy_enum.zad1;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Dostępne pizze: ");
        for (Pizza pizza : Pizza.values()) {
            System.out.println(pizza);

        }
        Scanner input = new Scanner(System.in);
        System.out.println("Jaką pizzę wybierasz?");
        Pizza pizza = Pizza.valueOf(input.nextLine());
        input.close();

        System.out.println("Dziekujemy za zamówienie pizzy " + pizza.name());
    }
}
