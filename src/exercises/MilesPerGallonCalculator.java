package exercises;

import java.util.Scanner;

public class MilesPerGallonCalculator {
    public static void main(String[] args){
        Scanner in;
        in = new Scanner(System.in);

        double milesDriven;
        double gasConsumed;
        String milesPerGallon;

        System.out.println("Enter your miles driven:");
        milesDriven = in.nextInt();

        System.out.println("Enter your gas consumption:");
        gasConsumed = in.nextInt();

        milesPerGallon = String.valueOf(milesDriven * gasConsumed);

        System.out.println("Your gas mileage is: ".concat(milesPerGallon));


    }
}
