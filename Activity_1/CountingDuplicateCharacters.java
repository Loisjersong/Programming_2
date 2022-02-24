/**
 * @author Gonzales, Lois Jerson
 */
package Programming_2.Activity_1;

import java.util.Scanner;

public class CountingDuplicateCharacters {
    /**
     *  This method will count the duplicate characters in a string
     *  but it will only work on letter and numbers not on special characters
     * @param words this parameter will be used to be counted its duplicate
     */
    public static void countDuplicate(String words) {
        int count = 0;
        System.out.println("char : count");
            // loop will check if j matches a-z and increment count
            for(char i = 'A'; i <= 'Z'; i++) {
                for(int j = 0; j < words.length(); j++) {
                    if(words.charAt(j) == i)
                        count++;
                }
                // display character and its count
                if(count > 1) {
                    System.out.println("  " + i + "  :  " + count);
                }
                // reset count to zero
                count = 0;
            }

            // loop will check if j matches a-z and increment count
            for(char i = 'a'; i <= 'z'; i++) {
                for(int j = 0; j < words.length(); j++) {
                    if(words.charAt(j) == i)
                        count++;
                }
                // display character and its count
                if(count > 1) {
                    System.out.println("  " + i + "  :  " + count);
                }
                // reset count to zero
                count = 0;
            }

            // loop will check if j matches 0-9 and increment count
            for(char i = '0'; i <= '9'; i++) {
                for(int j = 0; j < words.length(); j++) {
                    if(words.charAt(j) == i)
                        count++;
                }
                
                // display character and its count
                if(count > 1) {
                    System.out.println("  " + i + "  :  " + count);
                }
                // reset count to zero
                count = 0;
            }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // asks user for input
        System.out.print("Enter a string: ");
        String words = input.nextLine();
        System.out.println();
        
        // invoke countDuplicate method
        countDuplicate(words);

    }
}