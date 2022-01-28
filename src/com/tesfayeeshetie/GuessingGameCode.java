package com.tesfayeeshetie;

import java.util.Scanner;

public class GuessingGameCode {
    static void numberGuessingGame(int numberToBeGuessed, int upperBound) {

        boolean numberNotGuessed = false;

        // pre check loop
        while (!numberNotGuessed) // while the number is not found this is true and when found this becomes false
        {
            // Take input from user to compare to random number to check if they match
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Enter number between 0 - %s :  ", upperBound);
            int userGuessedNumber = scanner.nextInt();
            // Checks to see if the number the user input is the same as the random number
            if (userGuessedNumber == numberToBeGuessed) {
                System.out.println("You guessed the right number!"); // if yes print they found the number
                numberNotGuessed = true;

            } else if (userGuessedNumber < numberToBeGuessed) {
                // if number input is to small
                // tell user to guess bigger
                System.out.println("Number too low! Try a bigger number"); // if no they need to try again
                // Lastly number must be to high
                // Tell user to guess lower
            } else {
                System.out.println("Number too high! Try a smaller number");
            }
        }

    }
}





