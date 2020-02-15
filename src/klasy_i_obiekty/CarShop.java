package klasy_i_obiekty;

public class CarShop {
    public static void main(String[] args) {
        Car audi = new Car();
        System.out.println(audi.brand);
        audi.brand = "Audi";
        audi.model = "A4";
        audi.doors = 4;
        audi.carColor = "Czarny";
        audi.wheelsColor = "Srebrny";
        audi.tiresColor = "Czarny";

        Car audiCopy = audi;
        audiCopy.model = "A5";

        String aufiInfo = audi.brand + "" + audi.model
                + ", Drzwi: " + audi.doors
                + ", Kolor nadwozia: " + audi.carColor
                + ", Kolor felg: " + audi.wheelsColor
                + ", Kolor opon: " + audi.tiresColor;
        System.out.println("Wybrałeś następujący samochód:");
        System.out.println(aufiInfo);
    }
}
