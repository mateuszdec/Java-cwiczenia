package zadania.lekcja2_tabliceISterowanie.operacjaNaTablicach;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        //ZADANIE 1
        int[][] multiArr1 = {
                {1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3}
        };
        int[][] multiArr2 = {
                {4, 4, 4, 4, 4},
                {5, 5, 5, 5, 5},
                {6, 6, 6, 6, 6}
        };
        int[][] biggerArray = ArrayUtils.getBiggerArray(multiArr1, multiArr2);
        System.out.println("Większa tablica:");
        for (int[] ints : biggerArray) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("-------------------");
        //ZADANIE 2
        String[] strArr1 = {"Ala", "ma", "kota"};
        String[] strArr2 = {"Ala", "ma", "kota", "i", "psa"};
        String[] moreCharsArray = ArrayUtils.moreChars(strArr1, strArr2);
        System.out.println("Tablica z większą ilością znaków:");
        System.out.println(Arrays.toString(moreCharsArray));

        System.out.println("-------------------");
        //ZADANIE 3 i 4
        int[] numbers = {5, 1, 10, 105, 23, 45, 220, 87, 16};
        int max = ArrayUtils.max(numbers);
        int min = ArrayUtils.min(numbers);
        System.out.println("Największa liczba z tablicy " + Arrays.toString(numbers));
        System.out.println(max);
        System.out.println("Najmniejsza liczba z tablicy " + Arrays.toString(numbers));
        System.out.println(min);

        System.out.println("-------------------");
        //ZADANIE 5
        int[][] multiArr = {
                {1, 2, 3},
                {8, 9, 10},
                {4, 5, 6},
                {6, 7, 8}
        };
        int[] maxRow = ArrayUtils.maxRow(multiArr);
        System.out.println("Wiersz z największą sumą liczb: " + Arrays.toString(maxRow));
    }
}
