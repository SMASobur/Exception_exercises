package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

// Exercise 2: Multiple Exception Types
public class MultipleExeption {
    public static void multipleExeptionChecker(){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number (1-100): ");
            int number = scanner.nextInt();  // May throw InputMismatchException

            checkRange(number);  // May throw OutOfRangeException
            System.out.println("Valid number: " + number);

        } catch (InputMismatchException e) {
            System.out.println("Error: That's not a valid integer!");
            scanner.nextLine(); // Clear buffer

        } catch (OutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void checkRange(int number) throws OutOfRangeException{
        if (number<1 || number>100){
            throw new OutOfRangeException("Number must be between 1 and 100");
        }
    }
}
