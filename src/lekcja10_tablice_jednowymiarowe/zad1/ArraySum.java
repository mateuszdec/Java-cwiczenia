package lekcja10_tablice_jednowymiarowe.zad1;

public class ArraySum {
    public static void main(String[] args) {
        int[] tab1 = {6, 9, 12};
        int[] tab2 = {5, 10, 15};
        ArrayUtils arrayUtils = new ArrayUtils();

        int sum1 = arrayUtils.sumArrays(tab1, tab2);
        int sum = tab1[0] + tab1[1] + tab1[2] + tab2[0] + tab2[1] + tab2[2];

        System.out.println("Suma liczb w tablicy wynosi: " + sum);
        System.out.println("Suma liczb w tablicy wynosi: " + sum1);
    }
}
