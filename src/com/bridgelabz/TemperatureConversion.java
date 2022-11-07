package com.bridgelabz;

import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the Conversion you want \n1.Celsius to Fahrenheit \n2.Fahrenheit to Celsius");
        int result = scanner.nextInt();


        switch (result) {
            case 1:
                System.out.println("Enter a Celcius value => ");//(°C × 9/5) + 32 = °F
                float Celcius = scanner.nextFloat();
                float CelciusToFahrenheit = (Celcius * 9 / 5) + 32;
                System.out.println("Fahrenheit =>" + CelciusToFahrenheit);
                break;
            case 2:
                System.out.println("Enter a Fahrenheit value => ");//(°F − 32) x 5/9 = °C
                float Fahrenheit = scanner.nextFloat();
                float FahrenheitToCelcius = (Fahrenheit-32)*5/9;
                System.out.println("Celcius =>" + FahrenheitToCelcius);

                break;
            default:
                System.out.println("Entered Incorrect Input");
        }
    }
}
