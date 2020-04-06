package lekcja4_metody_i_konstruktory.zad2;

public class TimeTest {
    public static void main(String[] args) {

        TimeConverter timeConverter = new TimeConverter();
        int hours = 14;
        int minutes = timeConverter.hoursToMinutes(hours);
        int seconds = timeConverter.minutesToSeconds(minutes);
        int milis = timeConverter.secondsToMiliseconds(seconds);

        System.out.println(hours + " to " + hours);
        System.out.println(hours + " to " + minutes);
        System.out.println(hours + " to " + seconds);
        System.out.println(hours + " to " + milis);

    }
}
