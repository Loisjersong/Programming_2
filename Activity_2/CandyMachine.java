package Programming_2.Activity_2;

import java.util.ArrayList;
import java.util.Scanner;

public class CandyMachine {

    private String productName;
    private int productPrice;

    CandyMachine(String productName, int productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    ArrayList<CandyMachine> list = new ArrayList<>();

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

    public static void buyProduct(ArrayList<CandyMachine> list, Scanner input) {
        int choice;
        boolean run = true;
        String buy;
        do {
            System.out.print("Enter a number to checkout: ");
            choice = input.nextInt();

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

                default:
                    System.out.println("Invalid Input");
            }
            System.out.print("Would you like to buy a product again? Y/N: ");
            buy = input.next();
            System.out.println();
        }while(buy.equalsIgnoreCase("y")); 
        
    }

    public static int productTotal(ArrayList<CandyMachine> list) {
        int totalPrice = 0;
        for(int i = 0; i < list.size(); i++) {
            totalPrice += list.get(i).getProductPrice();
        }
        return totalPrice;
    }

    public static void showBoughtProducts(ArrayList<CandyMachine> list) {
        System.out.println("Items bought: ");
        for(int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i).getProductName() + " " + list.get(i).getProductPrice());
            if(list.get(i).getProductName() == "Kit-Kat") {
                System.out.println("Kit-Kat   25");
            } else if(list.get(i).getProductName() == "Frutos") {
                System.out.println("Frutos    22");
            } else if(list.get(i).getProductName() == "Hershey's") {
                System.out.println("Hershey's 55");
            } else if(list.get(i).getProductName() == "Mentos") {
                System.out.println("Mentos    10");
            } else if(list.get(i).getProductName() == "Potchi") {
                System.out.println("Potchi    40");
            } else if(list.get(i).getProductName() == "Sugus") {
                System.out.println("Sugus     13");
            } else if(list.get(i).getProductName() == "Skittles") {
                System.out.println("Skittles  90");
            } else if(list.get(i).getProductName() == "Snow bear") {
                System.out.println("Snow bear 34");
            } else if(list.get(i).getProductName() == "M&M's") {
                System.out.println("M&M's     76");
            } else if(list.get(i).getProductName() == "Snickers") {
                System.out.println("Snickers  39");
            }
        }
        System.out.println();
    }

}
