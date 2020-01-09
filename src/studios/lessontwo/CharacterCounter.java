package studios.lessontwo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        String fileText = readFileAsString();
        Integer count = 0;
        char[] charactersInString = fileText.toCharArray();
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

    public static String readFileAsString() {
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get("/home/james/IdeaProjects/java-web-dev-exercises/src/studios/lessontwo/file.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
