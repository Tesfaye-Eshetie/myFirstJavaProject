package com.tesfayeeshetie;

import com.tesfayeeshetie.data.Conversion;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.tesfayeeshetie.Calculator.bodyMassCalculator;
import static com.tesfayeeshetie.GuessingGameCode.numberGuessingGame;

public class Main {

//    ***********************************************************
//    A function which convert pound in to kilogram

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float massInPound;
        System.out.print("Insert your weight in pound then, I will convert to in kilograms? ");

        while (true) {
            try {
                massInPound = scanner.nextFloat();
                if (massInPound >= 10f && massInPound <= 1_000f)
                    break;
                System.out.print("Please inter a valued number between 10 to 1000?  ");
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please re-enter:  ");
                scanner.nextLine();
            }
        }
        Conversion.poundsToKilograms(massInPound);

//        ******************************************
//        Body mass Calculator
        System.out.print("How much do you weight in kilogram? ");
        float weight;
        while (true){
            try {
                weight = scanner.nextFloat();
                if (weight >= 1f && weight <= 500f)
                    break;
                System.out.print("Please inter a valued number between 1 to 500?  ");
            } catch (InputMismatchException e){
                System.out.print("Invalid input. Please re-enter:  ");
                scanner.nextLine();
            }
        }
        System.out.print("How long is your height in meter? ");
        float height;
        while (true) {
            try {
                height = scanner.nextFloat();
                if (height >= 0f && height <= 5f)
                    break;
                System.out.print("Please inter a valued number between 10 to 1000?  ");
            } catch (InputMismatchException e) {
            System.out.print("Invalid input. Please re-enter:  ");
            scanner.nextLine();
        }
        }
        bodyMassCalculator(weight, height);

//    *******************************************************
//        Program to guess a random number

        // Take input from user to compare to random number to check if they match
        int upperBound = 100;

        // How to make a random.
        int numberToBeGuessed = (int) Math.floor(Math.random() * (upperBound));

        numberGuessingGame(numberToBeGuessed, upperBound);

//        ************************************************************

//        System.out.print("What is your name?  ");
//        String name = scanner.next();
//        System.out.printf("Your name is %s. %n", name);
//        System.out.print("How old are you?  ");
//        byte age = scanner.nextByte();
//        System.out.printf("%s is %s years old.%n", name, age);

//        ******************************************************
//        Conversion of temperature from Fahrenheit-to-Celsius

        System.out.print("How much is a temperature to day in your area in degree fahrenheit?  ");
        float temperatureInFahrenheit;
        while (true) {
            try {
                temperatureInFahrenheit = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
            System.out.print("Invalid input. Please re-enter:  ");
            scanner.nextLine();
            }
        }
        Conversion.fahrenheitToCelsiusConverter(temperatureInFahrenheit);

//        *************************************************************
//        Conversion of temperature from Celsius-to-Fahrenheit

        System.out.print("How much is a temperature to day in your area in degree Celsius?  ");
        float temperatureCelsius;
        while (true) {
            try {
                temperatureCelsius = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please re-enter:  ");
                scanner.nextLine();
            }
        }
        Conversion.celsiusToFahrenheitConverter(temperatureCelsius);

    }
}
