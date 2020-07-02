package zadania.lekcja3_programowanieObiektowe2.rysowanie;

import java.util.Scanner;

public class ShapeDrawer {

    private static final String RECTANGLE_NAME = "rectangle";
    private static final String SQUARE_NAME = "square";
    private static final String TREE_NAME = "tree";

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Drawable drawable = readAndCreateShape();
        if(drawable != null)
            drawable.draw();
    }

    private static Drawable readAndCreateShape() {
        Drawable drawable = null;
        System.out.println("Co chcesz narysować? (rectangle / square / tree)");
        String element = scanner.nextLine();
        switch (element) {
            case RECTANGLE_NAME:
                drawable = readAndCreateRectangle();
                break;
            case SQUARE_NAME:
                drawable = readAndCreateSquare();
                break;
            case TREE_NAME:
                drawable = readAndCreateTree();
                break;
            default:
                System.out.println("Taki kształt nie istnieje");
        }
        return drawable;
    }

    private static Drawable readAndCreateTree() {
        System.out.println("Podaj wysokość choinki:");
        int height = scanner.nextInt();
        return new Tree(height);
    }

    private static Drawable readAndCreateSquare() {
        System.out.println("Podaj długość boku kwadratu");
        int a = scanner.nextInt();
        return new Square(a);
    }

    private static Drawable readAndCreateRectangle() {
        System.out.println("Podaj długość pierwszego boku (długość)");
        int a = scanner.nextInt();
        System.out.println("Podaj długość drugiego boku (wysokość)");
        int b = scanner.nextInt();
        return new Rectangle(a, b);
    }

}
