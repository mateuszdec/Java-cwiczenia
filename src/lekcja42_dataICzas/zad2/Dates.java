package lekcja42_dataICzas.zad2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        try {
            LocalDate date1 = readDateFromUser();
            LocalDate date2 = readDateFromUser();
            showLaterDate(date1, date2);
            showPeriodBetween(date1, date2);
        } catch (DateTimeParseException e) {
            System.out.println("Podano datę w nieprawidłowym formacie");
        }
    }


    private static void showLaterDate(LocalDate date1, LocalDate date2) {
        LocalDate laterDate = date1.isAfter(date2) ? date1 : date2;
        System.out.println("Późniejsza data " + laterDate);
    }

    private static void showPeriodBetween(LocalDate date1, LocalDate date2) {
        Period between = Period.between(date1, date2);
        int days = Math.abs(between.getDays());
        int months = Math.abs(between.getMonths());
        int years = Math.abs(between.getYears());
        System.out.printf("Podane daty dzieli %d lat, %d miesięcy i %d dni", years, months, days);
    }

//    private static LocalDate readDateFromUser() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj dzień miesiąca");
//        int day = scanner.nextInt();
//        System.out.println("Podaj miesiąc");
//        int month = scanner.nextInt();
//        System.out.println("Podaj rok");
//        int year = scanner.nextInt();
//        return LocalDate.of(year, month, day);
//    }

    private static LocalDate readDateFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj datę w formacie yyyy-MM-dd");
        String dateInput = scanner.nextLine();
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(dateInput, datePattern);
    }
}
