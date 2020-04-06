package specyfikatory_dostępu7.zad2.logic;

import specyfikatory_dostępu7.zad2.model.Telephone;

public class Charger {
    public void charge(Telephone telephone) {
        int currentCharge = telephone.getChargeLevel();
        telephone.setChargeLevel(currentCharge + 1);
    }
}
