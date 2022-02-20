/** 
* @author Gonzales, Lois Jerson A.
*/
package Programming_2.Activity_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Counting_duplicate_characters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String words = input.nextLine();
        System.out.println("Duplicated characters: ");

        Map<Character, Integer> countDuplicate = new HashMap<>();
        char[] charArray = words.toCharArray();

        for(char e: charArray) {
            if(countDuplicate.containsKey(e)) {
                countDuplicate.put(e, countDuplicate.get(e) + 1);
            } else {
                countDuplicate.put(e, 1);
            }
        }

        for (Entry < Character, Integer > entry: countDuplicate.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

    }
}
