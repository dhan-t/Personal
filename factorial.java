/*
  Showing factorial through code.
  This code asks the user for a number and said number will have the displayed factorialized.

  //-GODISGOOD//
  
*/

// Instantiation
import java.util.*;
import java.io.*;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// Prompts the user to input a number.
        System.out.print("Enter a number: ");

// Checks whether or not the user input is an integer.
// If the input is not an int, the while loop does not stop looping until
// conditions are met.
// The while loop will not start if the first input is an int.
        while (!sc.hasNextInt()) {

// Asks the user to input again if the first input was not an integer.
            System.out.println("Invalid input! Please enter a number.");
            sc.next();
            System.out.print("Enter a number: ");
        }

// This is where the first input is initialized and attached to variable "inputNum".
// If not an int, while loop starts.
        int inputNum = sc.nextInt();

// Calls the recursion method and attaches it to "factorial" variable.
        int factorial = recursion(inputNum);

// Writes on the text file. Uses a generic way of writing to a text file so it can be universal to any computer.
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Testing.txt"));

// Writes the result to the txt file and not the process for a cleaner look.
            writer.write("factorial(" + inputNum + ") = " + factorial);
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

// Prints out the result again, this time in the IDE itself or the terminal.
        System.out.println("factorial(" + inputNum + ") = " + factorial);
        sc.close();
    }

// Recursion method
    public static int recursion(int inputNum) {

// Returns 1 if the user inputs 0, ending the code.
        if (inputNum == 0) {
            return 1;
        }

// First part prints out "factorial" with the inputNum.
// Second part prints the inputNum and shows that inputNum multiplies to the count down of recursion method.
        System.out.println("factorial(" + inputNum + ") = " + inputNum + " * " + (inputNum - 1) + "");

// Returns the result of inputNum multiplied to the inputNum minus 1.
        return inputNum * recursion(inputNum - 1);

    }
}
