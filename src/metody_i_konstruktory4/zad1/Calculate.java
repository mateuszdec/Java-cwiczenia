package metody_i_konstruktory4.zad1;

public class Calculate {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.subtract(3, 3));
        System.out.println(calculator.multiply(2, 2));
        System.out.println(calculator.divide(2, 2));
    }
}
