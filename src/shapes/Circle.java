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
}