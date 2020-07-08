package zadania.lekcja5_obsługaBłędów.automatZGrami;

import java.util.Scanner;

public class GameMachineController {
    public static void main(String[] args) {
        buyGame();
    }

    public static void buyGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj tytuł gry:");
        String gameTitle = scan.nextLine();
        System.out.println("Wpłać pieniądze:");
        double money = scan.nextDouble();
        GameMachine gameMachine = new GameMachine();
        try {
            Game game = gameMachine.buy(gameTitle, money);
            System.out.println("Odbierz grę " + game.getTitle());
            System.out.println("Odbierz resztę: " + (money - game.getPrice()));
        } catch(GameNotFoundException | NotEnoughMoneyException e) {
            System.err.println(e.getMessage());
        }
    }
}
