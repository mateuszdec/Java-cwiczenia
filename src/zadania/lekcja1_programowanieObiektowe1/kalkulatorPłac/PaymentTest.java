package zadania.lekcja1_programowanieObiektowe1.kalkulatorPłac;

public class PaymentTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Jan", "Kowalski", 3000);
        double nettoYearPayment = PaymentCalculator.nettoYearPayment(employee);
        double bruttoYearPayment = PaymentCalculator.bruttoYearPayment(employee);
        System.out.println("Roczna wypłata netto: " + nettoYearPayment);
        System.out.println("Roczna wypłata brutto: " + bruttoYearPayment);
    }
}
