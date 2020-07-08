package zadania.lekcja5_obsługaBłędów.automatZGrami;

public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException(double gamePrice, double moneyPaid) {
        super(String.format("The game cost is %.2f, you paid only %.2f", gamePrice, moneyPaid));
    }
}
