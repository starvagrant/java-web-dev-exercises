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
        Map<String, Integer> charMap = new HashMap<String, Integer>();
        for(Character c: charactersInString) {
            String lowerChar = c.toString().toLowerCase();
            lowerChar = lowerChar.replaceAll("[^a-z]", "");
            if (!lowerChar.equals("")) {
                if (charMap.containsKey(lowerChar)) {
                    count = charMap.get(lowerChar);
                    count++;
                    charMap.replace(lowerChar, count);
                } else {
                    charMap.put(lowerChar, 1);
                }
            }
        }

        for(Map.Entry letters: charMap.entrySet()) {
            System.out.println(letters.getKey() + ": " + letters.getValue());
        }

    }
}
