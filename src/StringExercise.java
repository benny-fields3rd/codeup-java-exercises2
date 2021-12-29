public class StringExercise {
    public static void main(String[] args) {

// 1. String Basics.
// - Create a class named StringExercise with a main method.
// - For each of the following output examples: create a String variable that contains the desired output and print it
//   out to the console, you can do this with only one String variable and one print statement for each output example.
//      We don't need no education
//      We don't need no thought control
//      Check "this" out!, "s inside of "s!
//      In windows, the main drive is usually C:\
//      I can do backslashes \, double backslashes \\,
//      and the amazing triple backslash \\\!
//       String message = "";
//       message += "We don't need no education\n";
//       message += "We don't need no thought control\n";
//       message += "Check \"this\" out!, \"s inside of \"s!\n";
//       message += "In windows, the main drive is usually C:\\\n";
//       message += "I can do backslashes \\, double backslashes \\\\, \nand the amazing triple backslash \\\\\\!";
//       System.out.println(message);

        System.out.println(printMessage());
}
        // or a better way is to create a method as follows
        public static String printMessage() {
        String message2;
        message2 = "We don't need no education\n";
        message2 += "We don't need no thought control\n";
        message2 += "Check \"this\" out!, \"s inside of \"s!\n";
        message2 += "In windows, the main drive is usually C:\\\n";
        message2 += "I can do backslashes \\, double backslashes \\\\, \nand the amazing triple backslash \\\\\\!";
        return message2;
    }
}
