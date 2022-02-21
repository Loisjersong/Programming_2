package Programming_2.Activity_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<CandyMachine> candies  = new ArrayList<>();

        CandyMachine.showMenu();
        CandyMachine.buyProduct(candies, input);
        CandyMachine.showBoughtProducts(candies);
        System.out.println("Total Price of Product: " + CandyMachine.productTotal(candies));

    }
    
}
