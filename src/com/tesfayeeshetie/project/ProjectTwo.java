package com.tesfayeeshetie.project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjectTwo {
    static void fahrenheitToCelsiusConverter(float fahrenheitTemperature) {
        float celsiusTemperature;
        celsiusTemperature = (fahrenheitTemperature - 32) * (5f / 9f);
        System.out.printf("%s fahrenheit temperature is equal to %s celsius temperature.%n -------------------------%n",
                fahrenheitTemperature,
                celsiusTemperature);
    }

    static void celsiusToFahrenheitConverter(float celsiusTemperature) {
        float fahrenheitTemperature;
        fahrenheitTemperature = ((celsiusTemperature * (9f / 5f)) + 32);
        System.out.printf("%s celsius temperature is equal to %s fahrenheit temperature.%n -------------------------%n",
                celsiusTemperature,
                fahrenheitTemperature);
    }


    public static void poundsToKilograms(float pounds) {
        float kilograms = (pounds / 2.2046f);
        System.out.printf("%s pounds is equal to %s kilograms.%n ----------------------%n",
                pounds,
                kilograms);
    }

    public static void kilogramInToPoundConversion(float kg) {
        float pound;
        pound = kg * 2.2046f;
        System.out.printf("%s kilogram is equal to %s. %n _________________________%n",
                kg,
                pound);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        *************************************************************
//        Conversion of temperature from Celsius-to-Fahrenheit

//        Prompt for receiving use input
        System.out.print("How much is a temperature to day in your area in degree fahrenheit?  ");
        float temperatureInFahrenheit;

//        Input validation to control error from use input
        while (true) {
            try {
                temperatureInFahrenheit = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please re-enter:  ");
                scanner.nextLine();
            }
        }
//        Call the method for converting the input temperature to Celsius temperature
        fahrenheitToCelsiusConverter(temperatureInFahrenheit);

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
        celsiusToFahrenheitConverter(temperatureCelsius);

//        *************************************************************
//        Conversion of mass from pound-to-kilogram

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
        poundsToKilograms(massInPound);

//        *************************************************************
//        Conversion of mass from kilogram-to-pound

        float weightKilogram;
        System.out.print("What is your weight in kilogram? ");

        while (true) {
            try {
                weightKilogram = scanner.nextFloat();
                if (weightKilogram >= 1f && weightKilogram <= 500f)
                    break;
                System.out.print("Please inter a valued number between 1 to 500?  ");
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please re-enter:  ");
                scanner.nextLine();
            }
        }

        kilogramInToPoundConversion(weightKilogram);

    }
}
