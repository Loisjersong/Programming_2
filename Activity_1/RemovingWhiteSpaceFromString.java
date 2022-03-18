/** 
* @author Gonzales, Lois Jerson A.
*/
package Activity_1;

import java.util.Scanner;

public class RemovingWhiteSpaceFromString {

    /**
     *  This method removes all the whitespace in the string
     * @param string the string which the whitespace will be removed
     * @return will return the removed whitespace string
     */
    public static String removeWhitespace(String string) {
        String removedSpace = "";
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ') {
                removedSpace +=  string.charAt(i);
            } else {
                continue;
            }
        }
        return removedSpace;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User will input any character combination
        System.out.print("Enter a String: ");
        String text = input.nextLine();
        System.out.println(removeWhitespace(text));

        // or use .replaceAll(); method to remove whitespace
        // String removedSpace = text.replaceAll("\\s", "");
        // System.out.print("Removed Whitespace: " + removedSpace);

    }
}
