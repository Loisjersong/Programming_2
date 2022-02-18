package Activity_1;
import java.util.Arrays;
import java.util.Scanner;

public class Checking_whether_two_strings_are_anagram {

    public static void checkIfAnagram(String string1, String string2) {
        int lenOfString1 = string1.length();
        int lenOfString2 = string2.length();
        if(lenOfString1 != lenOfString2) {
            System.out.println("The two string are not anagram");
        }

        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for(int i = 0; i < string1.length(); i++) {
            if(charArray1[i] != charArray2[i]) {
                System.out.println("The two string are not anagram");
            }
        }

        System.out.println("The two strings are anagram");

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String string1 = input.nextLine();
        System.out.println("Enter second string: ");
        String string2 = input.nextLine();

        checkIfAnagram(string1, string2);
    }
}
