package numbers;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class NumberGame {
    public static final int MAX_ATTEMPTS = 10;

    private Map<String, Player> players;
    private Scoreboard scoreboard;
    private Random random;
    private Scanner scanner;

    public NumberGame(Map<String, Player> players) {
        this.players = players;
        this.scoreboard = new Scoreboard(players);
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    public void playGame() {
        System.out.println("Welcome to the Number Game!");

        while (true) {
            System.out.print("Enter your name: ");
            String playerName = scanner.nextLine();
            Player currentPlayer = players.get(playerName);

            if (currentPlayer == null) {
                currentPlayer = new Player(playerName);
                players.put(playerName, currentPlayer);
            }

            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;

            while (attempts < MAX_ATTEMPTS) {
                System.out.print("Guess a number between 1 and 100: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();
                attempts++;
                if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations, " + currentPlayer.getName() + "! You guessed the correct number in " + attempts + " attempts.");
                    currentPlayer.updateScore(attempts);
                    System.out.println("Your score: " + currentPlayer.getScore());

                    // Update scores and highScores
                    scoreboard.updateScores(currentPlayer);

                    // Save results to a file
                    saveResultsToFile(currentPlayer.getName(), currentPlayer.getScore(), attempts);

                    // Display current high scores
                    scoreboard.displayHighScores();

                    break;
                }
            }

            System.out.print("Would you like to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }

    private void saveResultsToFile(String playerName, int score, int attempts) {
        try (FileWriter writer = new FileWriter("results.txt", true)) {
            writer.write("Player: " + playerName + ", Score: " + score + ", Attempts: " + attempts + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}