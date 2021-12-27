import java.util.Scanner;
// testing on macos m1 chip
public class Bob {
    public static void main(String[] args) {

// 2. Create a class named Bob with a main method for the following exercise.
// Bob is a lackadaisical teenager. In conversation, his responses are very limited.
// - Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
// - He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
// - He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
// - He answers 'Whatever.' to anything else.
// Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // variable more
        String more;

        // do while loop to create responses based on question type and ending
        do {
            System.out.println("Talk to Bob. Enter you sentence: ");
            String response = scanner.nextLine();
            if (response.endsWith("?")) {
                System.out.println("Sure.");
            } else if (response.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (response.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Do you want to continue to speak with Bob?");
            // assign user input to more
            more = scanner.nextLine();
        } while (more.equalsIgnoreCase("yes")); // allows for both uppercase or lowercase input
        System.out.println("Have a great day! Bob is done talking.");

    }
} // testing