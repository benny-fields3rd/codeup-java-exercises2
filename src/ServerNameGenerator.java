import java.util.Random;

public class ServerNameGenerator {

// 2. Server Name Generator
//
// We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow
// the specs below.

//      - Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    public static String[] adjectives = {"swifty", "amazing", "slow", "creative", "clean", "new", "shiny", "enhanced", "ghetto", "normal"};
    public static String[] nouns = {"car", "desk", "monkey", "cloud", "xbox", "game", "coffee", "shoe", "pill", "movie"};

//      - Create a method that will return a random element from an array of strings.
    public static String getRandomWord(String[] selection) {
        Random random = new Random();
        int randomNumber = random.nextInt(selection.length);
        return selection[randomNumber];
    }
//      - Add a main method, and inside of your main method select and random noun and adjective and hyphenate the
//        combination and display the generated name to the user.
//        Example Output
//        Here is your server name:
//        dedicated-photon

    public static void main(String[] args) {

        System.out.printf("Here is your server name: %n" + getRandomWord(adjectives) + "-" + getRandomWord(nouns));




    }



}
