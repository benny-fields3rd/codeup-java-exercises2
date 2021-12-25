import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

// 1.Copy this code into your main method:
// double pi = 3.14159;

        //double pi = 3.14159;

// Write some Java code that uses the variable pi to output the following:
        //System.out.format("The value of pi is approximately %.2f.", pi);

// Explore the Scanner Class
// 1. Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
//        System.out.println("Enter an integer: ");

//        int userInt = scanner.nextInt();
//        System.out.println("You entered the integer of: " + userInt);
//What happens if you input something that is not an integer?
//      It errors with exception because anything other than an integer will fail.

// 2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the
// console, each on a newline.
//        System.out.println("Enter your first word: ");
//        String userString1 = scanner.next();
//
//       System.out.println("Enter your second word: ");
//       String userString2 = scanner.next();
//
//       System.out.println("Enter your third word: ");
//       String userString3 = scanner.next();

//       System.out.println(userString1);
//       System.out.println(userString2);
//       System.out.println(userString3);

// What happens if you enter less than 3 words?
//         Code will not continue or complete.
// What happens if you enter more than 3 words?
//         It won't let you input more than three words, since it completes after the third input.

// 3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then,
// display that sentence back to the user.
//      System.out.println("Enter a sentence: ");
//      String userSentence1 = scanner.next();

//        System.out.println(userSentence1);
// Do you capture all the words?
// No. Using scanner.next() only captured the first word in the sentence.
// 4. Rewrite the above example using the nextLine method.
//        System.out.println("Enter a sentence: ");
//        String userSentence2 = scanner.nextLine();

//        System.out.println(userSentence2);

// Calculate the perimeter and area of Codeup's classrooms.
// 1. Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
// Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user
// input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
// Assume that the rooms are perfect rectangles.
// Assume that the user will enter valid numeric data for length and width.
        System.out.println("Enter length of Codeup classroom: ");
        int length = Integer.parseInt(scanner.nextLine());
//        float length = Float.parseFloat(scanner.nextLine()); // or scanner.next()

        System.out.println("Enter length of Codeup classroom: ");
        int width = Integer.parseInt(scanner.nextLine());
//        float width = Float.parseFloat(scanner.nextLine()); // or scanner.next()

        System.out.println("Enter height of Codeup classroom: ");
        int height = Integer.parseInt(scanner.nextLine());
//        float height = Float.parseFloat(scanner.nextLine()); // or scanner.next()

//        Find Perimeter
        int perimeter = (length * 2) + (width * 2);
//        float perimeter = (length * 2) + (width * 2);

//        Find Area
        int area = length * width;
//        float area = length * width;

//        Find Volume
        int volume = length * width * height;
//        float volume = length * width * height;

// 2. Display the area and perimeter of that classroom.
// The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times
// the length plus 2 times the width.
        System.out.println("The perimeter of the Codeup classroom is: " + perimeter + ".");
//        System.out.printf("The perimeter of the Codeup classroom is: %.2f. ", perimeter);

        System.out.println("The area of the Codeup classroom is: " + area + ".");
//        System.out.printf("The area of the Codeup classroom is: %.2f. ", area);

//Bonuses
// In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in
// addition to the area and perimeter.
// My changes to use decimals are listed above and commented out.
        System.out.println("The volume of the Codeup classroom is: " + volume+ ".");
//        System.out.printf("The volume of the Codeup classroom is: %.2f. ", volume);

// The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the
// useDelimiter method. Add the following line of code to your application after you have created a scanner
// (assuming the variable holding the Scanner is named scanner):
// scanner.useDelimiter("\n");
// How does this change the way your program operates?

// Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you
// should now have no trouble handling multiple pieces of user input.
// Did not do.
    }
}
