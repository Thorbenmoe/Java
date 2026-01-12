package Baiscs;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Temperatur
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        float temperaturInGrad;
        float temperaturInFahrenheit;
        System.out.println("Umrechnung von Fahrenheit in Grad");
        System.out.println("\n Eingabe des Wertes in Fahrenheit: \n");
        temperaturInFahrenheit=scan.nextFloat();
        temperaturInGrad = (5.0f/9.0f) * (temperaturInFahrenheit -32); 
        System.out.println("\n Der Wert beträgt:"+ df.format(temperaturInGrad) +"°C");
        scan.close();
    }
}