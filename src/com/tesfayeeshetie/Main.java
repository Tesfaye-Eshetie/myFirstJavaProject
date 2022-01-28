package com.tesfayeeshetie;

import com.tesfayeeshetie.data.Conversion;

import java.util.Scanner;

import static com.tesfayeeshetie.Calculator.bodyMassCalculator;
import static com.tesfayeeshetie.GuessingGameCode.numberGuessingGame;

public class Main {

    static void poundsToKilograms(float pounds) {
        float kilograms = (pounds / 2.2046f);
        System.out.printf("%s pounds is equal to %s kilograms.%n", pounds, kilograms);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert your weight in pound then, I will convert to in kilograms? ");
        poundsToKilograms(scanner.nextFloat());

//        Body mass Calculator
        System.out.print("How much do you weight? ");
        float weight = scanner.nextFloat();
        System.out.print("How long is your height? ");
        float height = scanner.nextFloat();
        bodyMassCalculator(weight, height);

//    *******************************************************
//        Program to guess a random number

        // Take input from user to compare to random number to check if they match
        int upperBound = 100;

        // How to make a random.
        int numberToBeGuessed = (int) Math.floor(Math.random() * (upperBound));

        numberGuessingGame(numberToBeGuessed, upperBound);

//        ************************************************************

        System.out.print("What is your name?  ");
        String name = scanner.nextLine().trim();
        System.out.printf("Your name is %s.", name);
        System.out.print("How old are you?  ");
        byte age = scanner.nextByte();
        System.out.printf("%s is %s years old.", name, age);

//        ******************************************************
//        Conversion of temperature from Fahrenheit-to-Celsius

        System.out.print("How much is a temperature to day in your area in degree fahrenheit?  ");
        float temperatureInFahrenheit = scanner.nextFloat();
        Conversion.fahrenheitToCelsiusConverter(temperatureInFahrenheit);

//        *************************************************************
//        Conversion of temperature from Celsius-to-Fahrenheit

        System.out.print("How much is a temperature to day in your area in degree Celsius?  ");
        float temperatureCelsius = scanner.nextFloat();
        Conversion.celsiusToFahrenheitConverter(temperatureCelsius);

    }
}
