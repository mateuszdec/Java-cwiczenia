package zadania.lekcja2_tabliceISterowanie.playlista;

import java.time.Duration;

public class Playlist {
    private static final int SECONDS_IN_HOUR = 60*60;
    private static final int SECONDS_IN_MINUTE = 60;

    public static int playlistLength(Song... songs) {
        int totalTime = 0;
        for (Song song : songs) {
            totalTime += song.getLength();
        }
        return totalTime;
    }

    public static String getFormattedTime(int seconds) {
//        int hours = seconds / SECONDS_IN_HOUR;
//        seconds %= SECONDS_IN_HOUR;
//        int minutes = seconds / SECONDS_IN_MINUTE;
//        seconds %= SECONDS_IN_MINUTE;
//        String hoursPart = timeToString(hours);
//        String minutesPart = timeToString(minutes);
//        String secondsPart = timeToString(seconds);
//        return hoursPart + ":" + minutesPart + ":" + secondsPart;

        Duration duration = Duration.ofSeconds(seconds);
        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        seconds = duration.toSecondsPart();
        String hoursPart = timeToString(hours);
        String minutesPart = timeToString(minutes);
        String secondsPart = timeToString(seconds);
        return hoursPart + ":" + minutesPart + ":" + secondsPart;
    }

    private static String timeToString(int hours) {
        String time;
        if(hours == 0)
            time = "00";
        else if(hours < 10)
            time = "0" + hours;
        else
            time = Integer.toString(hours);
        return time;
    }
}
