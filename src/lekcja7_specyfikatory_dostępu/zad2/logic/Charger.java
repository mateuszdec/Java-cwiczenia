package lekcja7_specyfikatory_dostępu.zad2.logic;

import lekcja7_specyfikatory_dostępu.zad2.model.Telephone;

public class Charger {
    public void charge(Telephone telephone) {
        int currentCharge = telephone.getChargeLevel();
        telephone.setChargeLevel(currentCharge + 1);
    }
}
