package lekcja7_specyfikatory_dostępu.zad1.app;

import lekcja7_specyfikatory_dostępu.zad1.controller.PointController;
import lekcja7_specyfikatory_dostępu.zad1.data.Point;

public class PoinApplication {
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        PointController pc = new PointController();

        System.out.println("Punkt: (" + point1.getX() + ";" + point1.getY() + ")");
        pc.addX(point1);
        System.out.println("Punkt addX: (" + point1.getX() + ";" + point1.getY() + ")");
        pc.addY(point1);
        System.out.println("Punkt addY: (" + point1.getX() + ";" + point1.getY() + ")");
        pc.minusX(point1);
        System.out.println("Punkt minusX: (" + point1.getX() + ";" + point1.getY() + ")");
        pc.minusY(point1);
        System.out.println("Punkt minusY: (" + point1.getX() + ";" + point1.getY() + ")");
    }
}
