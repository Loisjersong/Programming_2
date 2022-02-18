package Activity_1;
import java.util.Scanner;
public class Removing_white_space_from_a_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = input.nextLine();

        String removedSpace = text.replaceAll("\\s", "");
        System.out.print("Removed Whitespace: " + removedSpace);
        
    }
}
