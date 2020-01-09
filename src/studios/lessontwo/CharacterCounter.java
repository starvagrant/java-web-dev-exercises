package studios.lessontwo;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

    public static void main(String[] args) {
        String testText = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Integer count = 0;
        char[] charactersInString = testText.toCharArray();
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
