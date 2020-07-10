package zadania.lekcja6_pracaZPlikami.statystykiLoterii;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class LotteryStats {

    static Stream<Map.Entry<Integer, Integer>> mostPopularNumbers(List<Result> results) {
        return numbersOccurences(results).entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
    }

    static Stream<Map.Entry<Integer, Long>> mostPopularMegaBall(List<Result> results) {
        return results.stream()
                .map(Result::getMegaBall)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
    }

    private static Map<Integer, Integer> numbersOccurences(List<Result> results) {
        Map<Integer, Integer> numbersOccurences = new HashMap<>();
        for (Result result : results) {
            for (int number : result.getNumbers()) {
                numbersOccurences.merge(number, 1, Integer::sum);
            }
        }
        return numbersOccurences;
    }
}
