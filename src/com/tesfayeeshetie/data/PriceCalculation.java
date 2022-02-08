package com.tesfayeeshetie.data;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PriceCalculation {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in); // Variable that reads input from keyboard
        // Florida State Tax
        final double STATE_TAX = .075;

        // Read in user item name and price
        System.out.println("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.println("Enter item price: ");
        double itemPrice = scanner.nextDouble();

        // checks if item price is less than or equal zero and there is no item name
        if (itemPrice <= 0)
            System.out.println("Please provide item price!");

        // Formats number as a decimal
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String itemTotal = decimalFormat.format((itemPrice * STATE_TAX) + itemPrice);
        System.out.println("\nItem Name: " + itemName + "\nPrice: $" + itemTotal);

        System.out.println("Would you like to know the yearly cost? ");
        String yesOrNo = scanner.next();
        if (yesOrNo.charAt(0) == 'y') {
            Double yearlyTotal = 0.00;
            // Check Cost for year
            for (int i = 0; i < 12; i++) {
                int monthNumber = i + 1;
                yearlyTotal = ((itemPrice * STATE_TAX) + itemPrice) + yearlyTotal;
                String yearlyTotalAsString = decimalFormat.format(yearlyTotal);

                System.out.println("Cumulative cost by Month " + monthNumber + ": $" + yearlyTotalAsString);
            }
        }

        System.out.println("Thank you have a good day!");
    }

}
