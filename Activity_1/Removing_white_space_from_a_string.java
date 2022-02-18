/** 
* @author Gonzales, Lois Jerson A.
*/
package Activity_1;
import java.util.Scanner;
public class Removing_white_space_from_a_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User will input any character combination
        System.out.print("Enter a String: ");
        String text = input.nextLine();

        // removed whitespace is text variable and stored it in removeSpace
        String removedSpace = text.replaceAll("\\s", "");
        System.out.print("Removed Whitespace: " + removedSpace);
        
    }
}
