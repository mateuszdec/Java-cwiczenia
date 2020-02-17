package przeciążanie_metod_i_this5.zadanie;

public class CalcTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        double a = 30;
        double b = 20;
        double c = 10;

        System.out.println("A: " + a + ", B: " + b + ", C: " + c);

        System.out.println("A + B = " + calculator.add(a, b));
        System.out.println("A + B + C = " + calculator.add(a, b, c));

        System.out.println("A - B = " + calculator.subtract(a, b));
        System.out.println("A - B - C = " + calculator.subtract(a, b, c));
    }
}
