package lekcja2_klasy_i_obiekty.zad3;

public class Garden {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.name = "Storczyk";
        plant1.description = "Dwupędowy, kolorowy kwiat";
        plant1.waterConsumption = 0.1;

        Plant plant2 = new Plant();
        plant2.name = "Fikus";
        plant2.description = "Niskie drzewko, idealne na bonsai";
        plant2.waterConsumption = 0.15;

        Plant plant3 = new Plant();
        plant3.name = "Monstera";
        plant3.description = "Zielona roślina, która nadaje charakter każdemu wnętrzu";
        plant3.waterConsumption = 0.3;

        double dayliWaterConsumption = plant1.waterConsumption + plant2.waterConsumption + plant3.waterConsumption;
        double weeklyWaterConsumption = dayliWaterConsumption * 7;
        double yearlyWaterConsumption = dayliWaterConsumption * 365;

        System.out.println("Dzienne zapotrzebowanie na wodę: " + dayliWaterConsumption + "l");
        System.out.println("Tygodniowe zapotrzebowanie na wodę: " + weeklyWaterConsumption + "l");
        System.out.println("Roczne zapotrzebowanie na wodę: " + yearlyWaterConsumption + "l");
    }
}
