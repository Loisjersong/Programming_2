/** 
* @author Gonzales, Lois Jerson A.
*/
package Programming_2.Activity_1;

import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    /**
     * This is the method that will find the first
     * non repeated character in a string
     * @param string The value that will 
     * @return This returns the first non repeated character of it will return whitespace
     */
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

        // The user will input any character combination to be evaulated
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        // The if else code block determines if there is a non repeating character
        if(getFirstNonrepeating(string) == ' ') {
            System.out.println("There is no non-repeating character");
        } else {
            System.out.println("The first non repeating character is: " + getFirstNonrepeating(string));
        }
    }
}
