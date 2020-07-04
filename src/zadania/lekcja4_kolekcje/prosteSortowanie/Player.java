package zadania.lekcja4_kolekcje.prosteSortowanie;

public class Player implements Comparable<Player> {
    private String nickname;
    private int points;

    public Player(String nickname, int points) {
        this.nickname = nickname;
        this.points = points;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(Player p) {
        return Integer.compare(p.points, this.points);
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickname='" + nickname + '\'' +
                ", points=" + points +
                '}';
    }
}
