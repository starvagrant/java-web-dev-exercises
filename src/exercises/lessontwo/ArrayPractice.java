package exercises.lessontwo;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] fibonacci = new int[]{1, 1, 2, 3, 5, 8};
        String suess = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        for (int i=0; i < fibonacci.length; i++) {
            System.out.println(fibonacci[i]);
        }
        for (int i=0; i < fibonacci.length; i++) {
            if (fibonacci[i] % 2 == 1) {
                System.out.println(fibonacci[i]);
            }
        }

        String[] suessWords = suess.split(" ");
        System.out.println(Arrays.toString(suessWords));
        String[] suessSentences = suess.split("\\.");
        System.out.println(Arrays.toString(suessSentences));
    }
}
