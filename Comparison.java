/*
Name: Kennedy Keyes
Date: February 18, 2021
Name of Program: Comparison.java
Description: This program uses if statements to compare two integers, 
demonstrating the use of relational and equality operators.
 */
package comparison;
import java.util.Scanner; // program uses class Scanner
/**
 *
 * @author codingken
 */
public class Comparison {
// main method begins execution of Java application
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // read first number from user
        
        System.out.print("Enter second integer: "); // prompt
        int number2 = input.nextInt(); // read second number from user
        
        if (number1 == number2) {
            System.out.printf("%d == %d%n", number1, number2);
        }
        
        if (number1 != number2) {
            System.out.printf("%d != %d%n", number1, number2);  
        }
        
        if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2);
        }
        
        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);
        }
        
        if (number1 <= number2) {
            System.out.printf("%d <= %d%n", number1, number2);
        }
        
        if (number1 >= number2) {
            System.out.printf("%d >= %d%n", number1, number2);
        }
    } // end method main
} // end class Comparison
