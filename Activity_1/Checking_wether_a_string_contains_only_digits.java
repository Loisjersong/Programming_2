package Activity_1;
import java.util. Scanner;
public class Checking_wether_a_string_contains_only_digits {
    
    public static void checkedString(String string) {
        if(checkString(string) == true) {
            System.out.println("The string contains only digits");
        } else {
            System.out.println("The string contains mixed characters");
        }
        System.out.println();
    }

    public static boolean checkString(String string) {
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                return true;
            } else {
                return false;
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        System.out.println();
        
        checkedString(string);
    }
}
