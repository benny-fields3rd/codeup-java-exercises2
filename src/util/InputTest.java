package util;

import java.util.Scanner;

public class InputTest {
// Create another class named InputTest that has a static main method that uses all the methods from the Input class.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input(scanner);
        System.out.println("Enter your favorite color: ");
        String favoriteColor = input.getString();
        System.out.println(favoriteColor);

        System.out.println("Do you like the color silver [y/n]");
        boolean likeColor = input.yesNo();

        if (likeColor){
            System.out.println("Sweet! i like that color too!");
        } else {
            System.out.println("It's OK, there are many other colors to like.");
        }

        System.out.println("Enter a number between 1 and 50: ");

        int userInt = input.getInt();
        System.out.println("You chose the number: " + userInt);


    }
// Bonus
// Allow all of your methods for getting input to accept an optional String parameter named prompt. If passed, the
// method should show the given prompt to the user before parsing the input.













}
