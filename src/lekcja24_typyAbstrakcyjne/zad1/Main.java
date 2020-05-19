package lekcja24_typyAbstrakcyjne.zad1;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator shapeCalc = new ShapeCalculator();
        Shape shape = null;
        
        boolean readComplete = false;
        
        while (!readComplete) {
            try {
                printOption();
                shape = shapeCalc.createShape();
            }
        }
    }

    private static void printOption() {
        System.out.println("Wybierz figurę, dla której chcesz obliczyć pole i obwód");
        System.out.println(Shape.RECTANGLE + " - prostokąt");
        System.out.println(Shape.CIRCLE + " - koło");
        System.out.println(Shape.TRIANGLE + " - trójkąt");
    }
}
