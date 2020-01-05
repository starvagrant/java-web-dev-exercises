package exercises.lessonone;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is side one?");
        Double side1 = input.nextDouble();
        System.out.println("What is side two?");
        Double side2 = input.nextDouble();
        System.out.println(("The Rectangle's Area is:" + side1 * side2));
        System.out.println();
    }
}