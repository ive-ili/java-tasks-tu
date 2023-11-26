package numbers;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Player> players = new HashMap<>();
        NumberGame numberGame = new NumberGame(players);
        numberGame.playGame();
    }
}