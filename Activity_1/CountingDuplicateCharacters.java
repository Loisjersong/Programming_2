/**
 * @author Gonzales, Lois Jerson
 */
package Programming_2.Activity_1;

import java.util.Scanner;

public class CountingDuplicateCharacters {
    /**
     *  This method will count the duplicated characters in a string
     * @param words this parameter will be used to be counted its duplicate
     */
    public static void countDuplicate(String words) {
        int count = 0;
        System.out.println("char : count");

        for(char i = 33; i <= 126; i++) {
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