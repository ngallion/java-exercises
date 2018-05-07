package exercises;

import java.util.Scanner;

public class Alice {
    private static String alice =
            "Alice was beginning to get very tired of sitting by her sister on the bank, and of" +
                    " having nothing to do: once or twice she had peeped into the book her sister" +
                    " was reading, but it had no pictures or conversations in it, 'and what is the" +
                    " use of a book,' thought Alice 'without pictures or conversation?'";

    public static void main(String[] args){
        Scanner in;
        in = new Scanner(System.in);

        String userInput;

        System.out.println(alice);
        System.out.println("Enter word for search:");
        userInput = in.next();

        Boolean containsPhrase;

        containsPhrase = alice.toLowerCase().contains(userInput);

        System.out.println(String.valueOf(containsPhrase));
    }
}
