package exercises;

import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args){
        Scanner in;
        in = new Scanner(System.in);

        int inputHeight;
        int inputWidth;
        int area;

        System.out.println("Enter height:");
        inputHeight = in.nextInt();

        System.out.println("Enter width:");
        inputWidth = in.nextInt();

        area = inputWidth * inputHeight;

        System.out.println(area);


    }
}
