package lekcja23_wyjątki.zad2;

public class MaxCompetitorsException extends RuntimeException {
    private final int maxCompetitors;

    public MaxCompetitorsException(int maxCompetitors) {
        this.maxCompetitors = maxCompetitors;
    }

    public int getMaxCompetitors() {
        return maxCompetitors;
    }
}
