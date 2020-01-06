package exercises.lessontwo;

import java.util.*;

public class ArrayListPractice {

    public static void sumAllEvenNumbers(ArrayList<Integer> intArray) {
        Integer total = 0;
        for (Integer number: intArray) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        System.out.println(total);
    }
    public static void printWordsOfLength(List<String> wordArray, Integer wordLength) {
        for (String word : wordArray) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] sampleInts = {0,1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> intArray = new ArrayList<>();
        String[] sampleStrs = {"I", "would", "not", "could", "not"};
        String suessString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> strArray = new ArrayList<>();
        String[] suessArray = suessString.split("[., ]+");
        List<String> als = new ArrayList<String>();
        als = Arrays.asList(suessArray);

        for (int i = 0; i < sampleInts.length; i++) {
            intArray.add(sampleInts[i]);
        }
        for (int i = 0; i < sampleStrs.length; i++) {
            strArray.add(sampleStrs[i]);
        }
        sumAllEvenNumbers(intArray);
        Scanner input = new Scanner(System.in);
        Integer wordLength = input.nextInt();
        printWordsOfLength(strArray, wordLength);
        printWordsOfLength(als, wordLength);
    }
}
