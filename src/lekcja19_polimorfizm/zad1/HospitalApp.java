package lekcja19_polimorfizm.zad1;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Maciek", "Prefeska", 7500, 1300));
        hospital.add(new Nurse("Ania", "Dobroszka", 2200, 6));
        hospital.add(new Nurse("Marta", "Kostka", 2800, 3));

        System.out.println("Pracownicy szpitala ");
        System.out.println(hospital.getInfo());
    }
}
