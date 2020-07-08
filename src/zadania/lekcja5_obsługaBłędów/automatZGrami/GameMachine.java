package zadania.lekcja5_obsługaBłędów.automatZGrami;

import java.util.Map;

public class GameMachine {

    private Map<String, Game> games = Map.of("GTA V", new Game("GTA V", 99),
            "Legend of Zelda", new Game("Legend of Zelda", 129),
            "Wiedźmin III", new Game("Wiedźmin III", 79));

    public Game buy(String gameTitle, double money) {
        if(!games.containsKey(gameTitle))
            throw new GameNotFoundException(gameTitle);
        Game game = games.get(gameTitle);
        if(money < game.getPrice())
            throw new NotEnoughMoneyException(game.getPrice(), money);
        return game;
    }

}
