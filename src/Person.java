public class Person {

// 1. Object basics
// Create Person class inside of src that has a private name field that is a string, and the following methods:
/*
    public String getName(){
    // TODO: return the person's name
    }

    public void setName(String name){
    // TODO: change the name field to the passed value
    }
    public void sayHello(){
    // TODO: print a message to the console using the person's name
    }
*/
    // declare string name
    private String name;

    public Person(){
    }

    public Person(String name){ //constructor
        this.name = name;
    }
    public String getName(){
    // return the person's name
        return this.name;
    }
    public void setName(String name){
    // change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){ // Note, if void use sout or souf, if public String sayHello, you can use return as well.
    // print a message to the console using the person's name
        System.out.printf("Hello %s!", name);
    }

    // main method
    public static void main(String[] args) {

        // THanks to the constructor above, the below code will work
        Person p1 = new Person("Benny");
        Person p2 = new Person("Frank");
        System.out.println(p2.getName());

// 2. Understanding references
// The following code blocks make use of the Person class from the previous exercise. For each code block, think about
// what the code will output, then copy the code into IntelliJ and run it to see if it matches your expectations.

        Person person1 = new Person("John"); // assigns John to person1
        Person person2 = new Person("John"); // assigns John to person2
        System.out.println(person1.getName().equals(person2.getName())); // true for value being equal
        System.out.println(person1 == person2); // false for different reference type (2 different people named John)

        Person person3 = new Person("John"); // assigns John to person3
        Person person4 = person3; // assigns value (John) also to person4
        System.out.println(person3 == person4); // true because values are same

        Person person5 = new Person("John"); // assign John to person5
        Person person6 = person5; // assigns value of person5 to person 6
        System.out.println(person5.getName()); // prints John
        System.out.println(person6.getName()); // prints john
        person6.setName("Jane"); // changes name of person5 and 6, assigns value
        System.out.println(person5.getName()); // prints Jane
        System.out.println(person6.getName()); // prints Jane

    }
}
