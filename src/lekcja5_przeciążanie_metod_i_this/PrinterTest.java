package lekcja5_przeciążanie_metod_i_this;

public class PrinterTest {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();
        numberPrinter.printNumber(5, 10);
        numberPrinter.printNumber(5, 10, 15);
    }
}
