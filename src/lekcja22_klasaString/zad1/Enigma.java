package lekcja22_klasaString.zad1;

import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        String[] words = getWords();
        String finalWords = createWordsFromLastLetters(words);
        System.out.println("Nowe słowo: " + finalWords);
    }

    private static String createWordsFromLastLetters(String[] words) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            int index = words[i].length() - 1;
            build.append(words[i].charAt(index));
        }
        return build.toString();
    }

    private static String[] getWords() {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbę wyrazów: ");
        int wordsNumber = input.nextInt();
        input.nextLine();

        String[] words = new String[wordsNumber];

        for (int i = 0; i < words.length; i++) {
            System.out.println("Podaj kolejne słowo: ");
            words[i] = input.nextLine();
        }
        input.close();
        return words;
    }
}
