package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {

// Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your
// Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to
// import your Input class.)

//The formulas for the circumference and area:

/*
        circumference = 2 x pi x radius
        area = pi x (radius ^ 2)
*/

// For the value of pi, use the PI constant of the Math class.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Input input = new Input(scanner);
        System.out.println("Please enter a radius length: ");
        double radius = input.getDouble();

        Circle circle = new Circle(input.getDouble());
        System.out.println("The circumference of a circle is " + circle.getCircumference());
        System.out.println(" The are of the circle is " + circle.getArea());




    }


// Bonus
// After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make
// another. Continue creating circles and displaying information about them until the user says they do not want
// to continue.

// Before exiting, the program should output the total number of circles created. Use a private static field, along
// with a public static method to keep track of and display the total number of circles created.

}
