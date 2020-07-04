package zadania.lekcja4_kolekcje.prosteSortowanie;

import java.util.Arrays;
import java.util.Comparator;

//public class PlayerSorting {
//    public static void main(String[] args) {
//        Player[] players = {
//                new Player("johnny", 1250),
//                new Player("barracuda", 3000),
//                new Player("zyzy", 987),
//                new Player("extrim", 3298)
//        };
//
//        Arrays.sort(players);
//        System.out.println("Posortowane po punktach (malejąco)");
//        System.out.println(Arrays.toString(players));
//
//        Arrays.sort(players, new Comparator<Player>() {
//            @Override
//            public int compare(Player p1, Player p2) {
//                return Integer.compare(p1.getPoints(), p2.getPoints());
//            }
//        });
//        System.out.println("Posortowane po punktach (rosnąco)");
//        System.out.println(Arrays.toString(players));
//
//        Arrays.sort(players, new NicknameComparatorAsc());
//        System.out.println("Posortowane alfabetycznie (rosnąco)");
//        System.out.println(Arrays.toString(players));
//
//        Arrays.sort(players, new NicknameComparatorDesc());
//        System.out.println("Posortowane alfabetycznie (malejąco)");
//        System.out.println(Arrays.toString(players));
//    }
//}




public class PlayerSorting {
    public static void main(String[] args) {
        Player[] players = {
                new Player("johnny", 1250),
                new Player("barracuda", 3000),
                new Player("zyzy", 987),
                new Player("extrim", 3298)
        };

        Arrays.sort(players);
        System.out.println("Posortowane po punktach (malejąco)");
        System.out.println(Arrays.toString(players));

        Arrays.sort(players, (p1, p2) -> Integer.compare(p1.getPoints(), p2.getPoints()));
        System.out.println("Posortowane po punktach (rosnąco)");
        System.out.println(Arrays.toString(players));

        Arrays.sort(players, Comparator.comparing(Player::getNickname));
        System.out.println("Posortowane alfabetycznie (rosnąco)");
        System.out.println(Arrays.toString(players));

        Arrays.sort(players, Comparator.comparing(Player::getNickname).reversed());
        System.out.println("Posortowane alfabetycznie (malejąco)");
        System.out.println(Arrays.toString(players));
    }
}

