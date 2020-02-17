package metody_i_konstruktory4.zad2;

public class MetricTest {
    public static void main(String[] args) {

        MetricConverter metricConverter = new MetricConverter();
        double m = 2.5;
        double metersToCm = metricConverter.metersToCm(m);
        double metersToMm = metricConverter.metersToMm(m);
        double centimeterToMeters = metricConverter.centimeterToMeters(m);
        double milimetersToMeters = metricConverter.milimetersToMeters(m);

        System.out.println(m + " to " + metersToCm);
        System.out.println(m + " to " + metersToMm);
        System.out.println(m + " to " + centimeterToMeters);
        System.out.println(m + " to " + milimetersToMeters);
    }
}
