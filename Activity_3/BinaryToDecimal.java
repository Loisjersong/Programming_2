/**
 *@author Gonzales, Lois Jerson A.
 * Binary to Decimal program
 */
package Activity_3;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BinaryToDecimal {

    // this methods converts binary to decimal
    public static void enterBinary() {
            String[] selection = {"Convert"};
            String binaryString = JOptionPane.showInputDialog( "Enter a 6-bit binary number");
            //int binary = Integer.parseInt(binaryString);

            // checks if user input only contans 1's and 0's
            for(int i = 0; i < binaryString.length(); i++) {
                if(binaryString.charAt(i) != '1' &&  binaryString.charAt(i) != '0') {
                    JOptionPane.showMessageDialog(null, "Only enter 6-bit binary number", "Warning", JOptionPane.ERROR_MESSAGE);
                    enterBinary();
                }
            }
            // check if user input length is greater than 6 characters
            if(binaryString.length() > 6) {
                JOptionPane.showMessageDialog(null, "Only enter 6-bit binary number", "Warning", JOptionPane.ERROR_MESSAGE);
                enterBinary();
            }
            
            // converte binary to decimal value
            int i = binaryString.length() - 1;
            int baseValue = 2;
            int powerValue = 1;
            int exponentValue = 0;
            int decimalNumber = 0; // holds total decimal value

            while (i >= 0) {
                if(binaryString.charAt(i) == '1') { // runs the code block if character value is 1
                    for(int j = 0; j < exponentValue; j++) { // adds 2 to the power value depending on exponent value
                        powerValue *= baseValue;
                    }
                    decimalNumber += powerValue; // adds the total power value to decimal value
                    powerValue = 1; // reset power value
                }
                i--; 
                exponentValue++; // increment exponent value to increase for loop iteration
            }

        String[] option = {"Convert again", "Exit"};
        int showValue = JOptionPane.showOptionDialog(null,
                                    "Binary: " + binaryString + "\nDecimal: " + decimalNumber,
                                    "Output",
                                    JOptionPane.YES_OPTION,
                                    JOptionPane.INFORMATION_MESSAGE,
                                    null,
                                    option,
                                    option[0]);
        
        if(showValue == 0) {
            enterBinary();
        } else {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        ImageIcon binaryIcon = new ImageIcon("Activity_3/binary.jpg"); // imports image icon
        String[] introChoice = {"Convert", "Exit"};

        // front GUI of the program
        int introMessage = JOptionPane.showOptionDialog(null,
                                    "Welcome to Gonzales'\nBinary to Decimal Converter",
                                    "Binary to Decimal",
                                    JOptionPane.OK_OPTION,
                                    JOptionPane.INFORMATION_MESSAGE,
                                    binaryIcon,
                                    introChoice,
                                    0);
        
        if(introMessage == 1) {
            System.exit(0); // close program if user clicks "exit"
        } else if (introMessage == 0) {
            enterBinary(); // invoke binary to decimal conversion
            
        }

        

    }
    
}
