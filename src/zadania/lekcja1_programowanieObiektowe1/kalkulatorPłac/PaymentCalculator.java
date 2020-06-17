package zadania.lekcja1_programowanieObiektowe1.kalkulatorPłac;

public class PaymentCalculator {
    private final static double MONTHLY_ZUS = 1000;

    public static double nettoYearPayment(Employee employee) {
        return employee.getSalary() * 12;
    }

    public static double bruttoYearPayment(Employee employee) {
        double nettoSalary = employee.getSalary();
        double bruttoSalary = nettoSalary * 0.2;
        return 12 * (nettoSalary  + bruttoSalary + MONTHLY_ZUS);
    }
}
