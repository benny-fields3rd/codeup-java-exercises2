import java.util.Scanner;

public class HighLow {
// 5. Game Development 101
//      Welcome to the world of game development!
//      You are going to build a high-low guessing game. Create a class named HighLow inside of src.
// The specs for the game are:-
//      - Game picks a random number between 1 and 100.
//      - Prompts user to guess the number.
//      - All user inputs are validated.
//      - If user's guess is less than the number, it outputs "HIGHER".
//      - If user's guess is more than the number, it outputs "LOWER".
//      - If a user guesses the number, the game should declare "GOOD GUESS!"
// Hints
//      - Use the random method of the java.lang.Math class to generate a random number.
// Bonus
//      - Keep track of how many guesses a user makes.
//      - Set an upper limit on the number of guesses.

    public static int numberOfGuesses;
    public static int gameNumber;

    public static void main(String[] args) {
        initGame();
    }

    public static void initGame() {
        boolean programRunning;
        boolean gameRunning = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the High / Low Guessing Game!");

        do {
            gameNumber = randomWithRange(1, 100);
            System.out.println("The random number is: " + gameNumber);
            do {
                gameRunning = runRound(scanner);
            } while (gameRunning);
            programRunning = getYesOrNo(scanner).equals("y");
        } while (programRunning);
        System.out.println("Good bye!");
    }

    public static boolean runRound(Scanner scanner) {
        boolean gameNotWon = false;
        System.out.print("Please enter a guess: ");
        int playerGuess = getInteger(1, 100, scanner);

        if (playerGuess == gameNumber) {
            System.out.println("GOOD GUESS!");
            gameNotWon = false;
        } else if (playerGuess > gameNumber) {
            System.out.println("LOWER");
            numberOfGuesses++;
            gameNotWon = true;
            System.out.println("Number of guesses made: " + numberOfGuesses);
        } else {
            System.out.println("HIGHER");
            gameNotWon = true;
            numberOfGuesses++;
            System.out.println("Number of guesses made: " + numberOfGuesses);
        }
        return gameNotWon;
    }

    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public static int getInteger(int min, int max, Scanner scanner) {
        if (!scanner.hasNextInt()) {
            System.out.println("Not a number!");
            return getInteger(min, max, scanner);
        }
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInteger(min, max, scanner);
        }
    }

    public static String getYesOrNo(Scanner scanner) {
        String userChoice;

        do {
            System.out.println("Do you wish to play again? [y/n]: ");
            userChoice = scanner.next().trim();
        } while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n"));
        return userChoice;
    }
}
