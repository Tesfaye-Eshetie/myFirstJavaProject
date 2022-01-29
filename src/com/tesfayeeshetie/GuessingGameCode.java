package com.tesfayeeshetie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGameCode {
    static void numberGuessingGame(int numberToBeGuessed, int upperBound) {

        // Take input from user to compare to random number to check if they match
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter number between 0 - %s :  ", upperBound);

        boolean numberNotGuessed = false;

        // pre check loop
        while (!numberNotGuessed) // while the number is not found this is true and when found this becomes false
        {
            int userGuessedNumber;
//            Input validation
            while (true) {
                try {
                    userGuessedNumber = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Invalid input. Please re-enter:  ");
                    scanner.nextLine();
                }
            }
            // Checks to see if the number the user input is the same as the random number
            if (userGuessedNumber == numberToBeGuessed) {
                System.out.print("You guessed the right number! "); // if yes print they found the number
                numberNotGuessed = true;

            } else if (userGuessedNumber < numberToBeGuessed) {
                // if number input is to small
                // tell user to guess bigger
                System.out.print("Number too low! Try a bigger number "); // if no they need to try again
                // Lastly number must be to high
                // Tell user to guess lower
            } else {
                System.out.println("Number too high! Try a smaller number");
            }
        }

    }
}





