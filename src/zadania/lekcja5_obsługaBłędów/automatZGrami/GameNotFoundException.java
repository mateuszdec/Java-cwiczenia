package zadania.lekcja5_obsługaBłędów.automatZGrami;

public class GameNotFoundException extends RuntimeException {
    public GameNotFoundException(String gameTitle) {
        super("Game not found: " + gameTitle);
    }
}
