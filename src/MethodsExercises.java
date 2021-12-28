import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MethodsExercises {

    public static void main(String[] args) throws Exception {
    // Call methods in the main method ^^

    // Testing Exercise 1
/*      System.out.println("Adding: " + add(2, 5));
        System.out.println("Subtracting: " + subtract(10, 5));
        System.out.println("Multiplying: " + multiply(5, 5));
        System.out.println("Dividing: " + divide(10, 2));
        System.out.println("Modulus: " + modulus(100, 2));
*/
    // Testing Exercise 2
/*      int userInput = getInteger(1, 10);
        System.out.println("Your integer is: " + userInput + ".");
*/
    // Testing Exercise 3
        Scanner sc = new Scanner(System.in);
        userInputFactorial(sc);


        rollDiceAsk();
        //int x = 5;
        //System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);

    }

// Create a class named MethodsExercises. Inside of your class, write code to create the specified methods.
// Test your code by creating a main method and calling each of the methods you've created.
//
// 1. Basic Arithmetic
// a. Create four separate methods. Each will perform an arithmetic operation:
// - Addition
// - Subtraction
// - Multiplication
// - Division
// b. Each function needs to take two parameters/arguments so that the operation can be performed.
// c. Test your methods and verify the output.
// d. Add a modulus method that finds the modulus of two numbers.

    // add
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    // subtract
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    // multiply
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    // divide
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
    // modulus - this was extra
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }
// Food for thought: What happens if we try to divide by zero? What should happen?
// Bonus
// a. Create your multiplication method without the * operator (Hint: a loop might be helpful).
// b. Do the above with recursion.

// 2. Create a method that validates that user input is in a certain range
// The method signature should look like this:
// public static int getInteger(int min, int max);
// and is used like this:
// System.out.print("Enter a number between 1 and 10: ");
// int userInput = getInteger(1, 10);
// If the input is invalid, prompt the user again.
// Hint: recursion might be helpful here!

    public static int getInteger(int min, int max){
        //System.out.println("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);

        // if not a number, send message to user and return getInteger()
        if (!scanner.hasNextInt()) {
            System.out.println("Not a number! Enter another number between 1 and 20.");
            return getInteger(min, max);
        }
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            //System.out.println("Your number is: " + userInput + " and is within range. Good job!");
            return userInput;
        } else {
            System.out.println("Number is not in range! Enter another number between 1 and 10.");
            return getInteger(min, max);
        }
    }

// 3. Calculate the factorial of a number.
// - Prompt the user to enter an integer from 1 to 10.
// - Display the factorial of the number entered by the user.
// - Ask if the user wants to continue.
// - Use a for loop to calculate the factorial.
// - Assume that the user will enter an integer, but verify it’s between 1 and 10.
// - Use the long type to store the factorial.
// - Continue only if the user agrees to.
// - A factorial is a number multiplied by each of the numbers before it.
// - Factorials are denoted by the exclamation point (n!). Ex:
// 1! = 1               = 1
// 2! = 1 x 2           = 2
// 3! = 1 x 2 x 3       = 6
// 4! = 1 x 2 x 3 x 4   = 24

    // method to calculate factor
    public static long factorialCalculate(int num1) {
        int output = 1;
        for (int i = 1; i <= num1; i += 1) {
            output *= i;
        }
        return output;
    }

    // asking user for input
    public static void userInputFactorial(Scanner scanner) {
        boolean doContinue;
        String userDecision;
        do {
            String message = "Let's find Factorials! ";
            System.out.println(message + "\nPlease enter a number between 1 and 10: ");
            int userInt = getInteger(1, 10);
            String factorMessage = "The factor of your input ";
            System.out.println(factorMessage + userInt + " is: " + factorialCalculate(userInt) + ".");
            do {
                System.out.println("Would you like to continue? [y/n] ");
                userDecision = scanner.next().trim();
            }while (!userDecision.equalsIgnoreCase("y") & !userDecision.equalsIgnoreCase("n"));
            doContinue = userDecision.equalsIgnoreCase("y");
        } while (doContinue);
    }




// Bonus
// - Test the application and find the integer for the highest factorial that can be accurately calculated by this
// application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that
// returns accurate factorial calculation}". Don’t forget to change your verification too!
// - Use recursion to implement the factorial.


// 4. Create an application that simulates dice rolling.
// - Ask the user to enter the number of sides for a pair of dice.
// - Prompt the user to roll the dice.
// - "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
// - Use static methods to implement the method(s) that generate the random numbers.
// - Use the .random method of the java.lang.Math class to generate random numbers.

    // method to ask user if they want to play and display message based on their input
    public static void rollDiceAsk() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play a dice game. Press enter to play.");
        String enter = sc.nextLine();
        if (enter.equals("")) {
            System.out.println("Enter the number of sides for a pair of dice [1-6]: ");
            int input = sc.nextInt();
            sc.nextLine();
            System.out.println("Would you like to roll [ yes or no ]?");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                rollDice(input);
            } else {
                System.out.println("You didn't answer yes. Oh well, thanks for playing.");
            }
        } else {
            System.out.println("You didn't press enter. Oh well, maybe next time.");
        }
    }
    // method to perform dice roll and get random numbers
    // also used delayed print to simulate rolling action
    public static void rollDice(int input) throws Exception {
        printWithDelays("Rolling Die\n", TimeUnit.MILLISECONDS, 200);
//        System.out.println(" ");
        int dieOne = (int)(Math.random()*input) + 1;
        int dieTwo = (int)(Math.random()*input) + 1;
        System.out.printf("\nDie one is %d.", dieOne);
        System.out.printf("\nDie two is %d.\n", dieTwo);
        System.out.printf("The total roll is: %d.", (dieOne + dieTwo));
        System.out.println("\nWould you like to roll again?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            rollDice(input);
        } else {
            System.out.println("You didn't answer yes. Oh well, thanks for playing");
        }
    }
    // delay print function
    // https://stackoverflow.com/questions/19882885/making-text-appear-delayed
    public static void printWithDelays(String data, TimeUnit unit, long delay)
            throws InterruptedException {
        for (char ch:data.toCharArray()) {
            System.out.print(ch);
            unit.sleep(delay);
        }
    }

// 5. Game Development 101
// Welcome to the world of game development!
// You are going to build a high-low guessing game. Create a class named HighLow inside of src.
// The specs for the game are:-
// - Game picks a random number between 1 and 100.
// - Prompts user to guess the number.
// - All user inputs are validated.
// - If user's guess is less than the number, it outputs "HIGHER".
// - If user's guess is more than the number, it outputs "LOWER".
// - If a user guesses the number, the game should declare "GOOD GUESS!"
// Hints
// - Use the random method of the java.lang.Math class to generate a random number.
// Bonus
// - Keep track of how many guesses a user makes.
// - Set an upper limit on the number of guesses.



}
