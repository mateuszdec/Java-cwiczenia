package lekcja29_typyGeneryczne.zad1;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, String> pair1 = new Pair<>("Ania", "Kowalska");
        Pair<Double, Double> pair2 = new Pair<>(5.5, 10.5);

        System.out.println(pair1.getT() + " " + pair1.getV());
        double sum = pair2.getT() + pair2.getV();
        System.out.println(sum);
    }


}
