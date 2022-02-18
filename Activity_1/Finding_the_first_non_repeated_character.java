package Activity_1;
import java.util.Scanner;
public class Finding_the_first_non_repeated_character {

    public static char getFirstNonrepeating(String string) {
        for (int i = 0; i < string.length(); i++) {
            if(string.indexOf(string.charAt(i)) == string.lastIndexOf(string.charAt(i))) {
                return string.charAt(i);
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        if(getFirstNonrepeating(string) == ' ') {
            System.out.println("There is no non-repeating character");
        } else {
            System.out.println("The first non repeating character is: " + getFirstNonrepeating(string));
        }
    }
}
