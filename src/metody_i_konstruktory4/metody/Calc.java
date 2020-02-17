package metody_i_konstruktory4.metody;

public class Calc {

    //Metody mają określoną konstrukcję -> typ_zwracany nazwaMetody(opcjonalne_parametry) { ciałoMetody }

    int addTwoNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    void addAndPrint(int x, int y) {
        int sum = addTwoNumbers(x, y);
        System.out.println(sum);
    }
}
