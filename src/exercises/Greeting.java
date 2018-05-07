package exercises;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        Scanner in;
        in = new Scanner(System.in);

        String userInput;

        System.out.println("Enter name:");
        userInput = in.nextLine();

        System.out.println("Hello, ".concat(userInput));
    }
}
