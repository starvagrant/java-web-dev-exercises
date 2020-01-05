package exercises.lessonone;
import java.util.Scanner;

public class Alice {
    protected String aliceText;


    public static void main(String[] args) {
        String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'\n";
        System.out.println("Enter search term");
        Scanner input = new Scanner(System.in);
        String searchTerm = input.nextLine();

        while(!aliceText.isEmpty()) {

            int index = aliceText.toLowerCase().indexOf(searchTerm.toLowerCase());
            System.out.println(aliceText.toLowerCase().indexOf(searchTerm.toLowerCase()) != -1);
            System.out.println(searchTerm + " found at index: " +
                    aliceText.toLowerCase().indexOf(searchTerm.toLowerCase())
                    + " String length: " + searchTerm.length());
            String regex = "(?i)" + searchTerm;
            aliceText = aliceText.replaceFirst(regex, "");
            System.out.println("Remaining Text");
            System.out.println(aliceText);
            System.out.println("Enter search term");
            searchTerm = input.nextLine();
        }
    }
}
