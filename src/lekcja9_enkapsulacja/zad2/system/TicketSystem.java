package lekcja9_enkapsulacja.zad2.system;

import lekcja9_enkapsulacja.zad2.model.Client;
import lekcja9_enkapsulacja.zad2.model.MovieShow;
import lekcja9_enkapsulacja.zad2.model.Ticket;

public class TicketSystem {
    Ticket createTicket(MovieShow movieShow, Client client){
        if (!movieShow.hasFreeSeats()) {
            System.out.println("Brak wolnych miejsc na wskazany seans");
            return null;
        } else if (!clientHasRequiredAgeForMovie(client, movieShow)) {
            System.out.println("Film dostępny dla osób powyżej " + movieShow.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = generateNextTicketId(movieShow);
            movieShow.decreaseFreeSeatsNumber();
            return new Ticket(ticketId, movieShow, client);
        }
    }

    private int generateNextTicketId(MovieShow movieShow) {
        return movieShow.getMaxSeats() - movieShow.getFreeSeats() + 1;
    }

    private boolean clientHasRequiredAgeForMovie(Client client, MovieShow movieShow) {
        return client.getAge() >= movieShow.getAgeRequired();
    }
}
