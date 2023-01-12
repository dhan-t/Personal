import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class attendance1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

// Initializing the numbers that are present in the file with the use of array.
// Also initializes found to false.
        Integer[] numbers = { 10, 12, 15, 11, 86, 25 };
        boolean found = false;

// Prompting user to input a number to be checked if present in the file.
        System.out.println("Enter a number to check if it is present in the file: ");
        Integer toFind = in.nextInt();

// Writing in the text file.
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/dhant/Desktop/Attendance1.txt"));

// Loops through the array to print out the numbers in the text file.
            writer.write("Numbers present: " + "\n");
            for (Integer number : numbers) {
                writer.write(number + ", ");
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

// Checks wether or not the inputted number is sent in the text file.
// If it is found, it changes the boolean found to true. if not it remains.
        for (int element : numbers) {
            if (element == toFind) {
                found = true;
            }
        }

// Checks to see if the boolean found is changed, if yes it prints find, else it prints not found.        
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not found.");
        }
    }
}
