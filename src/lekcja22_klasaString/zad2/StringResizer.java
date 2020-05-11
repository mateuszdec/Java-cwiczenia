package lekcja22_klasaString.zad2;

import java.util.Scanner;

public class StringResizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dowolny tekst: ");
        String text = scanner.nextLine();
        char firstCharacter = text.charAt(0);
        if (Character.isUpperCase(firstCharacter)) {
            text = text.toUpperCase();
        } else if (Character.isLowerCase(firstCharacter)) {
            text = text.toLowerCase();
        }
        System.out.println("Teskt po transformacji: ");
        System.out.println(text);
    }
}
