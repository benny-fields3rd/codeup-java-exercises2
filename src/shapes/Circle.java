package shapes;


public class Circle {


// Circle class
//
// Inside of src, create a package named shapes. Inside of shapes, create a class named Circle. This class should
// have a private radius field that is set through the constructor, and various methods for getting information
// about the circle, detailed below.
/*
        - public Circle(double radius)
        - public double getArea()
        - public double getCircumference()
*/
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        return Math.PI * 2 * this.radius;
    }

// Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your
// Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to
// import your Input class.)

//The formulas for the circumference and area:

/*
        circumference = 2 x pi x radius
        area = pi x (radius ^ 2)
*/

// For the value of pi, use the PI constant of the Math class.

// Bonus
// After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make
// another. Continue creating circles and displaying information about them until the user says they do not want
// to continue.

// Before exiting, the program should output the total number of circles created. Use a private static field, along
// with a public static method to keep track of and display the total number of circles created.

}