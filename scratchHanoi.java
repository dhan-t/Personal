/*
 * 
 * TOH.java
 * 
 * Purpose: 
 *  Present the user with the solution to the Tower of Hanoi game, where you have to move a tower of disk to another stick, one disk at a time. 
 * 
 * Input:
 *  Prompts users to input the number of disk they want to know the solution to.
 * 
 * Output:
 *  Program prints out the solution for the user based on the number of disks the latter inputted.
 * 
 * Error Handling:
 *  Before solution starts, the user input is checked if it is an integer, if not the user will be asked again to make another input.
 * 
 * 
 * Additional Notes:
 * - This program create a new file or open an existing one using the 'FileWriter' class and the 'BufferedWriter'class
 * - This program uses the 'write()' method to write the solution string to the file.
 * - In the methods, check if the number of discs is 1. If it is, simply move the disc from the first_pole to the second_pole and return.
 * - If the number of disks is greater than 1, use recursion to move the top n-1 disks from the first_pole to the third_pole.
 * - Move the last remaining disk from the first_pole to the second_pole.
 * - This program uses recursion to move the n-1 disks from the third_pole to the second_pole.
 * 
 * @author      John Angelo A. Basilio
 * @author      Dhan Micheal L. Tamparong
 * @author      Robbie Christian Emmanuel E. Espaldon
 * @version     1.0
 * @since       2023-01-26
 */

// Instantiation
import java.io.*;
import java.util.*;
import java.lang.Math;

public class App {
        static int movesMade = 1;

        public static void main(String[] args) throws IOException {
                Scanner sc = new Scanner(System.in);

                // Prints out the name of the program and the rules to the game TOH.
                System.out.println("<Tower of Hanoi Solution> \nThe rules are:");
                System.out.println("(1) You can only move one disk at a time. \n(2) You cannot place a bigger disk onto a smaller one.\n(3) You can only move one disk.\n");

                // Prompts the user to input the desired number of disks and attaches it to the "numDisk" variable.
                System.out.print("Enter the number of disk(s): ");

                // Validates user input. If input is not an integer, it loops until an integer is entered.
                while (!sc.hasNextInt()) {
                        System.out.println("Invalid input! Please enter a number.\n");
                        sc.next();
                        System.out.print("Enter the number of disk(s): ");
                }

                // numDisk variable.
                int numDisk = sc.nextInt();

                // Prints the line below, factoring user input.
                System.out.println("\nThe solution to a " + numDisk + " disk TOH is:");

                // Calls the "towerOfHanoi" method
                towerOfHanoi(numDisk, 'A', 'B', 'C');

                // Used to print out the solution as to how many moves one needs to make to solve ToH.
                double powerOf = (Math.pow(2, numDisk) - 1);
                System.out.println("\nWhy did it have " + powerOf + " moves?");

                // Prints out the formula in the terminal for users to see.
                System.out.println("Because the amount of moves is to be determined by 2^n-1 or 2 to the power of 'n'/amount of disks, minus 1");

                // Writing into a txt file in the same folder.
                FileWriter fw = new FileWriter("TowerOfHanoi_Results.txt");
                BufferedWriter bw = new BufferedWriter(fw);

                // Writes to the file the number of disks and moves made.
                bw.write("Number of disks: " + numDisk + "\n");
                bw.write("Number of moves made: " + movesMade + "\n");
                bw.write("Formula: 2^n - 1: " + powerOf + " moves" + "\n");
                
                // Closes the file.
                bw.close();
                // Closes the scanner.
                sc.close();

        }

        // Recursive method
        public static void towerOfHanoi(int numDisk, char firstRod, char secondRod, char thirdRod) throws IOException {

                // Base case.
                if (numDisk == 1) {
                        /*
                         * Rods and TOP1 Shows what the variables are like BEFORE printing out the sentence.
                         * Rods and TOP2 Shows it after printing the sentence.
                         * 
                         * This is used for tracking the code, and to figure out how it loops.
                         * 
                         */

                        System.out.println(firstRod + " TOP1");
                        System.out.println(secondRod + " TOP1");
                        System.out.println(thirdRod + " TOP1");
                        System.out.println("<" + movesMade + "> IF PRINT (1) from rod [" + firstRod + "] to rod {" + thirdRod + "}");
                        System.out.println("Base case");
                        System.out.println(firstRod + " TOP2");
                        System.out.println(secondRod + " TOP2");
                        System.out.println(thirdRod + " TOP2");

                        // movesMade is the variable used to track how many moves has been made, this is for readabilty.
                        movesMade++;

                } else{
                        /*
                         * Think of it as a multi dimension thing.
                         * 
                         * The first dimension is the first method call at the top, where
                         * 
                         * towerOfHanoi method is called when numDisk != 1, and it loops until it is = 1.
                         * This is done by the method call where numDisk - 1.
                         * 
                         * Factoring index changes at the method call when else is ran, firstRod[A], thirdRod[C], secondRod[B].
                         *
                         */
                        System.out.println("First call");
                        towerOfHanoi(numDisk - 1, firstRod, thirdRod, secondRod);


                        System.out.println("<" + movesMade + "> ELSE PRINT (" + numDisk + ") from rod [" + firstRod + "] to rod {" + thirdRod + "}");

                        // Prints out rod + MID to see what the rod Values are currently. 
                        System.out.println(firstRod + " MID");
                        System.out.println(secondRod + " MID");
                        System.out.println(thirdRod + " MID");

                        movesMade++;

                        /*
                         * // Another method call because it is not finished.
                         * // This time the first rod is [B] and second rod is [A], third rod remains.
                         * // Line 83 starts again, this time factoring variable change. (it loops again
                         * // until numDisk == 1)
                         * // Line 83 prints but, first rod is now [B], and it moves to rod [c]
                         */

                        System.out.println("Second call");

                        // Why rod[C] is printed WHEN firstRod is called? Because at line 114 thirdRod
                        // is at 2nd index call.
                        // Why rod[B] is printed WHEN thirdRod is called? Because third rod is at 3rd
                        // index at method call.

                        towerOfHanoi(numDisk - 1, secondRod, firstRod, thirdRod);
                        System.out.println(firstRod + " BOT");
                        System.out.println(secondRod + " BOT");
                        System.out.println(thirdRod + " BOT");
                }
        }
}
/*
 * 2^n-1 (2x2x2 = 8 - 1 = 7)
 * 
 *  Use multi dimensions when explaining.
 * 
 * 
 */
