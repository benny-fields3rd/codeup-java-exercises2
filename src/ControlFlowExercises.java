public class ControlFlowExercises {
    public static void main(String[] args) {

// 1. Loop Basics
// a. While
// Create an integer variable i with a value of 5.
// Create a while loop that runs so long as i is less than or equal to 15
// Each loop iteration, output the current value of i, then increment i by one.
// Your output should look like this:
// 5 6 7 8 9 10 11 12 13 14 15

//    int i =5;
//    while (i <= 15) {
//        System.out.print(i + " ");
//        i++;
//    }

// b. Do While
// Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//   int num = 0;
//   do {
//       System.out.println(num);
//       num += 2;
//   } while (num <= 100);

// Alter your loop to count backwards by 5's from 100 to -10.
//    int num2 = 100;
//   do {
//       System.out.println(num2);
//       num2 -= 5;
//   } while (num2 >= -10);

// Create a do-while loop that starts at 2, and displays the number squared on each line while the number
//  2
// 4
// 16
// 256
// 65536
//    double num3 = 2; //why does this have to be a double?
//   do {
//       int x = (int) num3;
//       System.out.println(x);
//       num3 *= num3;
//   } while (num3 <= 1000000 );

// c. For
// Refactor the previous two exercises to use a for loop instead.
    for (int i = 5; i <= 15; i++) {
        System.out.print(i + " ");
    }

    for (int num = 0; num <= 100; num +=2) {
        System.out.println(num);
    }

    for (int num2 = 100; num2 >= -10; num2 -= 5) {
        System.out.println(num2);
    }

    for (long num3 = 2; num3 <= 1000000; num3 *= num3 ) { // Check why long
        System.out.println(num3);
    }

// 2. Fizzbuzz

// One of the most common interview questions for entry-level programmers is the FizzBuzz test.
// Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

// Write a program that prints the numbers from 1 to 100.
// For multiples of three: print “Fizz” instead of the number.
// For the multiples of five: print “Buzz”.
// For numbers which are multiples of both three and five: print “FizzBuzz”.
    for (int f = 1; f <= 100; f++) {
//        System.out.println(f);
        if (f % 3 == 0 && f % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (f % 3 == 0) {
            System.out.println("Fizz");
        } else if (f % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(f);
        }
    }
// 4. Display a table of powers.

// Prompt the user to enter an integer.
// Display a table of squares and cubes from 1 to the value entered.
// Ask if the user wants to continue.
// Assume that the user will enter valid data.
// Only continue if the user agrees to.

// Example Output
// What number would you like to go up to? 5

//      Here is your table!
//      number | squared | cubed
//      ------ | ------- | -----
//      1      | 1       | 1
//      2      | 4       | 8
//      3      | 9       | 27
//      4      | 16      | 64
//      5      | 25      | 125

// 4. Convert given number grades into letter grades.

// Prompt the user for a numerical grade from 0 to 100.
// Display the corresponding letter grade.
// Prompt the user to continue.
// Assume that the user will enter valid integers for the grades.
// The application should only continue if the user agrees to.
// Grade Ranges:

// A : 100 - 88
// B : 87 - 80
// C : 79 - 67
// D : 66 - 60
// F : 59 - 0

// Bonus
// Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

    }
}
