package zadania.lekcja3_programowanieObiektowe2.klimatyzacja;

public class Main {
    public static void main(String[] args) {
        Building building = new Building(4);
        BuildingController controller = new BuildingController(building);
        controller.controlLoop();
    }
}
