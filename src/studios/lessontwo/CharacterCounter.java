package studios.lessontwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Integer count = 0;
        in.close();

        char[] charactersInString = line.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for(char c: charactersInString) {
            if (charMap.containsKey(c)) {
                count = charMap.get(c);
                count++;
                charMap.replace(c, count);
            } else {
                charMap.put(c, 1);
            }
        }

        for(Map.Entry letters: charMap.entrySet()) {
            System.out.println(letters.getKey() + ": " + letters.getValue());
        }

    }
}
