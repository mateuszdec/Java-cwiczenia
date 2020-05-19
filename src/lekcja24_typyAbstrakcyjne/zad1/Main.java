package lekcja24_typyAbstrakcyjne.zad1;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator shapeCalc = new ShapeCalculator();
        Shape shape = null;
        
        boolean readComplete = false;
        
        while (!readComplete) {
            try {
                printOption();
                shape = shapeCalc.createShape();
                readComplete = true;
            } catch (NoSuchElementException e) {
                System.out.println("Wybrany identyfikator kształtu jest niepoprawny, spróbuj ponownie");
            } finally {
                shapeCalc.clearBuffer();
            }
        }
        System.out.println(shape);
        shapeCalc.closeScanner();
    }

    private static void printOption() {
        System.out.println("Wybierz figurę, dla której chcesz obliczyć pole i obwód");
        System.out.println(Shape.RECTANGLE + " - prostokąt");
        System.out.println(Shape.CIRCLE + " - koło");
        System.out.println(Shape.TRIANGLE + " - trójkąt");
    }
}
