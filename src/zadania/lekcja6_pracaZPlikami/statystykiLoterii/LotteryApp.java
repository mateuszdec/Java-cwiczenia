package zadania.lekcja6_pracaZPlikami.statystykiLoterii;

import java.io.FileNotFoundException;
import java.util.List;

class LotteryApp {

    public static void main(String[] args) {
        var lotteryFileReader = new LotteryFileReader();
        try {
            List<Result> results = lotteryFileReader.readResultsFromFile("lottery.csv");
            System.out.println("10 Najpopularniejszych liczb: ");
            LotteryStats.mostPopularNumbers(results)
                    .limit(10)
                    .forEach(System.out::println);
            System.out.println("3 Najpopularniejsze mega ball:");
            LotteryStats.mostPopularMegaBall(results)
                    .limit(3)
                    .forEach(System.out::println);

        } catch (FileNotFoundException e) {
            System.err.println("There is no such file: lottery.csv");
        }
    }
}
