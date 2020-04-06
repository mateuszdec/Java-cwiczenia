package lekcja8_instrukcjeSterujące.zad1.app;

import lekcja8_instrukcjeSterujące.zad1.controller.PointController;
import lekcja8_instrukcjeSterujące.zad1.data.Point;

public class PoinApplication {
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        PointController pc = new PointController();

        int option = 0;
        final int addX = 0;
        final int addY = 1;
        final int minusX = 2;
        final int minusY = 3;

        switch (option) {
            case addX:
                pc.addX(point1);
                break;
            case addY:
                pc.addY(point1);
                break;
            case minusX:
                pc.minusX(point1);
                break;
            case minusY:
                pc.minusY(point1);
                break;
            default:
                System.out.println("Wybrano błędną opcję!");
        }
        System.out.println("Punkt po zmianie: (" + point1.getX() + ";" + point1.getY() + ")");
    }
}
