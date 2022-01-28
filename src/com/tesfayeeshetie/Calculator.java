package com.tesfayeeshetie;

public class Calculator {
    static void bodyMassCalculator(float weight, float height) {
        float bodyMass = weight / (height * height);
        System.out.printf("Your body mass is %s. %n", bodyMass);
    }
}
