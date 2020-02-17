package przeciążanie_metod_i_this5;

public class Car {
    int year;
    String brand;
    String model;
    String color;

    public Car(int year, String brand, String model, String color) {
        this(year, brand, model);
        this.color = color;
        System.out.println("Konstruktor 1");
    }

    public Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        System.out.println("Konstruktor 2");
    }
}
