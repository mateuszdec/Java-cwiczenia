package lekcja7_specyfikatory_dostępu.zad2.application;

import lekcja7_specyfikatory_dostępu.zad2.logic.Charger;
import lekcja7_specyfikatory_dostępu.zad2.model.Telephone;

public class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone.getBrand()
                + " " + telephone.getModel()
                + ", bateria: " + telephone.getBatteryCapacity() +"mAh"
                + ", poziom naładowania: " + telephone.getChargeLevel() + "%");
        Charger charger = new Charger();
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        System.out.println("Telefon po naładowaniu");
        System.out.println(telephone.getInfo());
    }
}
