package zadania.samochodyISpalanie;

class TestClass {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new Car("Audi A4", 50, 8, false);
        cars[1] = new Truck("Scania", 150, 18, false, 500);

        System.out.println("Klimatyzacja wyłączona:");
        for (Car car : cars) {
            System.out.println(car.getName() + " przejedzie " + car.range() + "km");
        }

        System.out.println("Klimatyzacja włączona:");
        for (Car car : cars) {
            car.setAirCondition(true);
            System.out.println(car.getName() + " przejedzie " + car.range() + "km");
        }
    }
}
