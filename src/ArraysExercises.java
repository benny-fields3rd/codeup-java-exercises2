import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {

// 1. Array Basics
// Create a class inside of src named ArraysExercises. Create a main method for this class to do your work.
// What happens when you run the following code? Why is Arrays.toString necessary?
/*
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
*/
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // [I@3fee733d
        // Arrays.toString is necessary because we didn't specify the index of the array
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]

// Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate
// through the array and print out the name of each person in the array.

        Person[] people = new Person[3];
        people[0] = new Person("Harry");
        people[1] = new Person("Sally");
        people[2] = new Person("Joseph");

        // traditional for loop
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName()); // without .getName(), you get funky numbers
        }

        people = addPerson(people, new Person("Samasus"));

        // enhanced for loop
        for (Person person : people) {
            System.out.println(person.getName()); // prints each name on new line
        }
    }

// Create a static method named addPerson. It should accept an array of Person objects, as well as a single person
// object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with
// the passed person object at the end of the array.

    public static Person[] addPerson(Person[] people, Person personExtra) {
        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);
        newPeopleArray[newPeopleArray.length - 1] = personExtra;
        return newPeopleArray;
    }

}
