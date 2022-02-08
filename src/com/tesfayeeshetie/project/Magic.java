package com.tesfayeeshetie.project;

import java.util.Random;
import java.util.Scanner;

//Skills you are practicing on this file:
// Input and Output using strings of text
// Booleans
// Creating random values that you can use in your programs
// Conditional statements
// Loops

public class Magic {
    public static void main(String[] args){
        // We need the scanner again so we can hear what the user tell us.
        Scanner scanner = new Scanner(System.in);

        // We need a way to get out of our loop, and we are going to ask the user
        // if they have more questions and save their answer to this variable
        // we have to declare the variable that we'll use to stop the loop
        // before the loop (this is in explained in Treehouse class)
        String moreQuestions;

        // We want to ask the user for a question at least one time
        // this is why we are using a do while structure
        // The steps that we want to repeat are:
        // * Get the user's question
        // * Generate the answer (random true or false)
        // * Give the user our answer in a yes no form
        // * Ask if they have any other questions
        // Because those are the steps we wanted repeated they are inside
        // the loop structure
        do {

            // Get the first user question:
            System.out.println("What is your question?");
            scanner.nextLine();

            // Use the java tool to generate a random 'true' or 'false'
            Random rd = new Random(); // creating Random object
            boolean booleanAnswer = rd.nextBoolean();

            // Use a conditional statement to transform the answer into yes or no
            if (booleanAnswer) {
                System.out.println("Yes!");
            } else {
                System.out.println("No");
            }

            // Ask if the user wants to keep playing with more questions
            System.out.println("Any more questions?");
            moreQuestions = scanner.nextLine();

            // if the user types anything that is not 'yes' exit the loop, the game ends
        } while (moreQuestions.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing magic 8 ball.");
    }
}