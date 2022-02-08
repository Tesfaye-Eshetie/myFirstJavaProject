package com.tesfayeeshetie.project;

import java.util.Scanner;

public class MainProject {
    public static void main(String[] args) {

//        *************************************************************
//        Conversion of temperature from Fahrenheit-to-Celsius

        Scanner scanner = new Scanner(System.in);
        System.out.print("How much is a temperature to day in your area in degree fahrenheit?  ");
        float fahrenheitTemperature = scanner.nextFloat();
        float celsiusTemperature = (fahrenheitTemperature - 32) * (5f / 9f);
        System.out.printf("%s fahrenheit temperature is equal to %s celsius temperature.%n", fahrenheitTemperature, celsiusTemperature);


//        *************************************************************
//        Conversion of temperature from Celsius-to-Fahrenheit

        System.out.print("How much is a temperature to day in your area in degree Celsius?  ");
        float temperatureCelsius = scanner.nextFloat();
        float temperatureInFahrenheit = ((temperatureCelsius * (9f / 5f)) + 32);
        System.out.printf("%s celsius temperature is equal to %s fahrenheit temperature.%n", temperatureCelsius, temperatureInFahrenheit);

//    ***********************************************************
//    A function which convert pound in to kilogram

        System.out.print("Insert your weight in pound then, I will convert to in kilograms? ");
        float massInPound = scanner.nextFloat();
        float massInKilogram = (massInPound / 2.2046f);
        System.out.printf("%s pounds is equal to %s kilograms.%n", massInPound, massInKilogram);

//    ***********************************************************
//    A function which convert kilogram in to pound

        System.out.print("Insert your weight in kilogram then, I will convert to in pound? ");
        float weightInKilogram = scanner.nextFloat();
        float weightInPound = (weightInKilogram * 2.2046f);
        System.out.printf("%s kilograms is equal to %s pounds.%n", weightInKilogram, weightInPound);
    }

}

