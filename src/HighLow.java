import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
    public static void main(String[] args) throws Exception{
        // calling getRandomIntegerBetweenRange inside guessNumber method
        guessNumber(getRandomIntegerBetweenRange(1, 100));
    } // end of main method

    // random number generator
    public static int getRandomIntegerBetweenRange(int min, int max)throws Exception {
        int randomInt = (int)(Math.random()*((max-min)+1))+min;
        System.out.println("Let's play \"Guess the Number\" game!");
        printWithDelays("Generating a random number...\n", TimeUnit.MILLISECONDS, 100);
        System.out.println("Number has been created.");
        return randomInt;
    } // end of getRandomIntegerBetweenRange method

    // Ask user to guess the number and validate input against random number
    public static int guessNumber(int randomInt)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number:"); // ask user for number input
        int guessedInput = sc.nextInt();

        if (guessedInput < randomInt) { // logic based on input to tell user to go higher
            System.out.println("higher..");
            numberOfGuesses++;
            System.out.println("Number of guesses made: " + numberOfGuesses);
            return guessNumber(randomInt);

        } else if (guessedInput > randomInt) { // logic based on input to tell user to go lower
            System.out.println("Lower...");
            numberOfGuesses++;
            System.out.println("Number of guesses made: " + numberOfGuesses);
            return guessNumber(randomInt);
        } else if (guessedInput == randomInt){ // if user guesses correctly, inform user
            System.out.printf("Congratulations! \nYou guessed the number!  \nThe number is %d!%n", randomInt);
            numberOfGuesses++;
            System.out.println("Number of guesses made: " + numberOfGuesses);
        }
        System.out.println("Do you want to play again?"); // ask user to play again
        String answer = sc.next();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            guessNumber(getRandomIntegerBetweenRange(1, 100));
        } else {
            System.out.println("No worries. Play again soon!");
        }
        return 0;
    } // end of guessNumber method

    // delay print function
    // https://stackoverflow.com/questions/19882885/making-text-appear-delayed
    public static void printWithDelays(String data, TimeUnit unit, long delay)
            throws InterruptedException {
        for (char ch:data.toCharArray()) {
            System.out.print(ch);
            unit.sleep(delay);
        }
    } // end of printWithDelays method
}
