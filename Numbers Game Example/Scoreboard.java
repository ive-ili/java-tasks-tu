package numbers;

import java.util.Map;
import java.util.TreeSet;

class Scoreboard {
    private Map<String, Player> players;
    private TreeSet<Player> highScores;

    public Scoreboard(Map<String, Player> players) {
        this.players = players;
        this.highScores = new TreeSet<>((p1, p2) -> Integer.compare(p2.getScore(), p1.getScore()));
    }

    public void updateScores(Player player) {
        players.put(player.getName(), player);
        highScores.clear();
        highScores.addAll(players.values());
    }

    public void displayHighScores() {
        System.out.println("Current High Scores:");
        int rank = 1;
        for (Player player : highScores) {
            System.out.println(rank + ". " + player.getName() + " - " + player.getScore());
            rank++;
        }
    }
}