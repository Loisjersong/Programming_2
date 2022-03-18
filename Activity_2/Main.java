/**
 * @author Gonzales, Lois Jerson A.
 */
package Activity_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<CandyMachine> candies  = new ArrayList<>();

        // invoked all methods from the CandyMachine Class
        CandyMachine.showMenu();
        CandyMachine.buyProduct(candies, input);
        CandyMachine.showBoughtProducts(candies);
        System.out.println("Total Price of Product: " + CandyMachine.productTotal(candies));
        CandyMachine.acceptPayment(candies, input);
    }
    
}
