/**
 * @author Gonzales, Lois Jerson A.
 */
package Activity_2;

import java.util.ArrayList;
import java.util.Scanner;

public class CandyMachine {

    private String productName;
    private int productPrice;

    CandyMachine(String productName, int productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String newProductName) {
        this.productName = newProductName;
    }

    public int getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(int newProductPrice) {
        this.productPrice = newProductPrice;
    }


    @Override
    public String toString() {
        return "[" + this.productName + ", " + this.productPrice + "]";
    }

    // This method is to show the list candies available in the shop
    public static void showMenu() {
        System.out.println("Welcome to Gonzales' Candy Machine!!!"); 
            System.out.println("Products-----Prices");
            System.out.println("[1] Kit-Kat   25");
            System.out.println("[2] Frutos    22");
            System.out.println("[3] Hershey's 55");
            System.out.println("[4] Mentos    10");
            System.out.println("[5] Potchi    40");
            System.out.println("[6] Sugus     13");
            System.out.println("[7] Skittles  90");
            System.out.println("[8] Snow bear 34");
            System.out.println("[9] M&M's     76");
            System.out.println("[10]Snickers  39");
            System.out.println();
    }
    /**
     * This method ask user to pick a candy of choice and add is to the ArrayList
     * @param list ArrayList of candies
     * @param input to ask input from the user
     */
    public static void buyProduct(ArrayList<CandyMachine> list, Scanner input) {
        int choice;
        String buy;
        int numOfCandy = 0;
        String nameOfCandy = "";
        do {
            System.out.print("What candy would you like to checkout[1-10]: ");
            choice = input.nextInt();

            // this control statement is used in the next control statement
            if(choice == 1) {
                nameOfCandy = "Kit-Kat";
            } else if (choice == 2) {
                nameOfCandy = "Frutos";
            } else if (choice == 3) {
                nameOfCandy = "Hershey's";
            } else if (choice == 4) {
                nameOfCandy = "Mentos";
            } else if (choice == 5) {
                nameOfCandy = "Potchi";
            } else if (choice == 6) {
                nameOfCandy = "Sugus";
            } else if (choice == 7) {
                nameOfCandy = "Skittles";
            } else if (choice == 8) {
                nameOfCandy = "Snow bear";
            } else if (choice == 9) {
                nameOfCandy = "M&M's";
            } else if (choice == 10) {
                nameOfCandy = "Snickers";
            }
            
            // asks user of the quantity of the candy
            if(choice < 10) {
                System.out.print("How many " + nameOfCandy + " do you like?: ");
                numOfCandy = input.nextInt();
            } else {
                System.out.println("Invalid input!");
            }

            // this whole code block adds selected candy in the ArrayList 
            for(int i = 0; i < numOfCandy; i++) {
                switch(choice) {
                    case 1:
                        list.add(new CandyMachine("Kit-Kat", 25));
                    break;

                    case 2:
                        list.add(new CandyMachine("Frutos", 22));
                    break;

                    case 3:
                        list.add(new CandyMachine("Hershey's", 55));
                    break;

                    case 4:
                        list.add(new CandyMachine("Mentos", 10));
                    break;

                    case 5:
                        list.add(new CandyMachine("Potchi", 40));
                    break;

                    case 6:
                        list.add(new CandyMachine("Sugus", 13));
                    break;

                    case 7:
                        list.add(new CandyMachine("Skittles", 90));
                    break;

                    case 8:
                        list.add(new CandyMachine("Snow bear", 34));
                    break;

                    case 9:
                        list.add(new CandyMachine("M&M's", 76));
                    break;

                    case 10:
                        list.add(new CandyMachine("Snickers", 39));
                    break;
                }
            }
            System.out.print("Would you like to buy a product again? Y/N: ");
            buy = input.next();
            System.out.println();
        }while(buy.equalsIgnoreCase("y")); 
        
    }

    /**
     * This method is used to calculate the total price of candies in the list
     * @param list hold the list of candies and its price
     * @return this will return the total price of the candies in the ArrayList
     */
    public static int productTotal(ArrayList<CandyMachine> list) {
        int totalPrice = 0;
        for(int i = 0; i < list.size(); i++) {
            totalPrice += list.get(i).getProductPrice();
        }
        return totalPrice;
    }

    /**
     * This method will show the total items that the user has inputted in the list
     * @param list hold the list of candies and its price
     */
    public static void showBoughtProducts(ArrayList<CandyMachine> list) {
        int count = 0;
        String[] candyNames = {"Kit-Kat", "Frutos", "Hershey's", "Mentos", "Potchi",
                                "Sugus", "Skittles", "Snow bear", "M&M's", "Snickers"};

        System.out.println("Items bought: ");

        // this for loop will calculate how many the quantity per candy
        for(int i = 0; i < candyNames.length; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j).getProductName().equals(candyNames[i])) 
                    count++;
            }
            if(count > 0) 
                System.out.println(candyNames[i] + " [" + count + "x]");

            count = 0;
        }
        System.out.println();
    }

    /**
     * This method is used to asked for payment from the user
     * @param input this variable is used for input
     */
    public static void acceptPayment(ArrayList<CandyMachine> list, Scanner input) {
        int money = 0;
        do {
            System.out.print("Please enter payment here: ");
            money  = input.nextInt();
            if (money < productTotal(list)) {
                System.out.println("Incomplete payment you still have " + (productTotal(list) - money) + " to pay");
            } else if (money > productTotal(list)) {
                System.out.println("your change is: " + (money - productTotal(list)));
                System.out.println("Thanks for buying with us!");
            }
        } while(money < productTotal(list));
    }
}
