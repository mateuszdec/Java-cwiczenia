package specyfikatory_dostępu7.zad1.controller;

import specyfikatory_dostępu7.zad1.data.Point;

public class PointController {

    public void addX(Point point) {
        int currentX = point.getX();
        point.setX(currentX + 1);
    }

    public void minusX(Point point) {
        int currentX = point.getX();
        point.setX(currentX - 1);
    }

    public void addY(Point point) {
        int currentY = point.getY();
        point.setY(currentY + 1);
    }

    public void minusY(Point point) {
        int currentY = point.getY();
        point.setY(currentY - 1);
    }
}
