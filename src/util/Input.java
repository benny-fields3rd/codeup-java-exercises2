package util;

import java.util.Scanner;

public class Input {
// 1. Create an input validation class
// Create a package inside of src named util. Inside of util, create a class named Input that has a private field named
// scanner. When an instance of this object is created, the scanner field should be set to a new instance of the
// Scanner class. The class should have the following methods, all of which return command line input from the user:
    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

//      - String getString()
    public String getString() {
        return scanner.nextLine();
    }

// The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//      - boolean yesNo()
    public boolean yesNo() {
        String input = getString();
        return (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"));
    }
// The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the
// min and max. The getDouble method should do the same thing, but with decimal numbers.
//      - int getInt(int min, int max)

    public int getInt(int min, int max) {
        int numberInput = getInt();
        if (numberInput >= min && numberInput <= max) {
            return numberInput;
        } else {
            System.out.println("Your number is out of range! Try again!");
            return getInt();
        }
    }

//      - int getInt()
    public int getInt() {
        if (!scanner.hasNextInt()) {
            System.out.println("Not a valid integer, try again");
            scanner.nextLine();
            return getInt();
        } else {
            return scanner.nextInt();
        }
    }
//      - double getDouble(double min, double max)

    public double getDouble(int min, int max) {
        double doubleInput = getDouble();
        if (doubleInput >= min && doubleInput <= max) {
            return doubleInput;
        } else {
            System.out.println("Your number is out of range! Try again!");
            return getDouble(min, max);
        }
    }
//      - double getDouble()

    public double getDouble() {
        if (!scanner.hasNextDouble()) {
            System.out.println("Not valid double, try again");
            scanner.nextLine();
            return getDouble();
        } else {
            return scanner.nextDouble();
        }
    }









}