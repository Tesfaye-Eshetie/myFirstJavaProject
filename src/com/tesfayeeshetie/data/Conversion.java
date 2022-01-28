package com.tesfayeeshetie.data;

public class Conversion {
    public static void fahrenheitToCelsiusConverter(float fahrenheitTemperature) {
        float celsiusTemperature;
        celsiusTemperature = (fahrenheitTemperature - 32) * (5f / 9f);
        System.out.printf("%s fahrenheit temperature is equal to %s celsius temperature.%n", fahrenheitTemperature, celsiusTemperature);
    }

    public static void celsiusToFahrenheitConverter(float celsiusTemperature) {
        float fahrenheitTemperature;
        fahrenheitTemperature = ((celsiusTemperature * (9f / 5f)) + 32);
        System.out.printf("%s celsius temperature is equal to %s fahrenheit temperature.%n", celsiusTemperature, fahrenheitTemperature);
    }
}
