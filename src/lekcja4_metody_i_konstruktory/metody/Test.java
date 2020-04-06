package lekcja4_metody_i_konstruktory.metody;

public class Test {
    public static void main(String[] args) {

        Calc calc = new Calc();
        int result = calc.addTwoNumbers(11, 12);
        int result2 = calc.addTwoNumbers(111, 122);
        int result3 = calc.addTwoNumbers(10, 45);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);


        calc.addAndPrint(155, 148);
    }
}
