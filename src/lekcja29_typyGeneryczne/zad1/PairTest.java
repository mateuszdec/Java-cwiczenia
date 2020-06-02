package lekcja29_typyGeneryczne.zad1;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, String> pair1 = new Pair<>("Ania", "Kowalska");
        Pair<Double, Double> pair2 = new Pair<>(5.5, 10.5);
        Pair<Integer, String> pair3 = new Pair<>(12345, "Jan Kowalski");

//        System.out.println(pair1.getT() + " " + pair1.getV());
        printPair(pair1);
        double sum = pair2.getT() + pair2.getV();
        printPair(pair2);
        System.out.println(sum);
        printPair(pair3);
    }

    static <T, V> void printPair(Pair<T, V> pair) {
        System.out.println(pair.getT() + " " + pair.getV());
    }
}
