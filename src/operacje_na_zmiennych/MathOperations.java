package operacje_na_zmiennych;

public class MathOperations {
    public static void main(String[] args) {
//        int x = 10;
//        int y = 4;
//         int sum = x + y;
//         int sub = x - y;
//         int multi = x * y ;
//         double div = x/y;
//         int mod = x % y;
//
//        System.out.println(sum);
//        System.out.println(sub);
//        System.out.println(multi);
//        System.out.println(div);
//        System.out.println(mod);
//
//
//
//        int a = 5;
//        int b = 10;
//        System.out.print("Czy X jest większy od Y? ");
//        System.out.println(a > b);
//
//        System.out.print("Czy X jest różny od Y? ");
//        System.out.println(a != b);
//
//        boolean instance = "Kasia" instanceof java.lang.String;
//        System.out.println(instance); // "Kasia" jest typu String
//
//        int x = 5;
//        int y = 10;
//        boolean logic = true;
//
//        System.out.print("x<10 && y<11? ");
//        System.out.println(x < 10 && y < 11);
//
//        System.out.print("x<10 && y<10? ");
//        System.out.println(x < 10 && y < 10);
//
//        System.out.print("x<10 || y<10? ");
//        System.out.println(x < 10 || y < 10);
//
//        System.out.print(logic);
//        System.out.print(" , !logic = ");
//        System.out.println(!logic);
//
//        System.out.print("Warunek złożony !(x<10 && y<10) ");
//        System.out.println(!(x < 10 && y < 10));
//
//
//        char letter1 = 'k';
//        char letter2 = 'o';
//        char letter3 = 't';
//        System.out.println("Błędne \"sumowanie\" znaków");
//        System.out.println("" + letter1 + letter2 + letter3);


        // zadanie
        int x = 4;
        int y = 7;

        boolean result = x > y;
        System.out.println("Czy x > y  " + result);

        result = x * 2 > y;
        System.out.println("Czy x pomnożone przez 2 jest większe od y " + result);

        result = (y < x + 3) && (y > x - 2);
        System.out.println("Czy (y < x + 3) && (y > x - 2) " + result);

        result = ((x * y) % 2 == 0);
        System.out.println("Czy x*y jest parzyste? " + result);
    }
}
