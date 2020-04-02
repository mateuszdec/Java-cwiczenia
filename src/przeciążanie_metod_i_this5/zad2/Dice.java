package przeciążanie_metod_i_this5.zad2;

import java.util.Random;

public class Dice {
    int top;

    Dice() {
        Random random = new Random();
        top = random.nextInt(6) + 1;
    }

    Dice(int top) {
        this.top = top;
    }

    void roll() {
        Random random = new Random();
        top = random.nextInt(6) + 1;
    }

    void printInfo() {
        System.out.println("Liczba oczek na kostce: " + top);
    }
}
