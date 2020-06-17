package zadania.lekcja1_programowanieObiektowe1.cabrio;

public class CabrioTest {
    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("M6 Cabrio", "BMW");
        cabrio.setRoofOpen(true);
        System.out.printf("Status samochodu. W ruchu: %s, Dach otwarty: %s\n", cabrio.isMoving(), cabrio.isRoofOpen());
        cabrio.setMoving(true);
        cabrio.setRoofOpen(false);//samochód się porusza, nie uda się złożyć dachu
        System.out.printf("Status samochodu. W ruchu: %s, Dach otwarty: %s", cabrio.isMoving(), cabrio.isRoofOpen());
    }
}
