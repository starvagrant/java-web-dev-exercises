package exercises.lessonone;

import java.util.Scanner;

public class GasCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much gas did you use?");
        Double gas = input.nextDouble();
        System.out.println("How many miles did you travel?");
        Double miles = input.nextDouble();
        System.out.println("You got " + miles / gas + "mpg");
    }
}
