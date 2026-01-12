package Baiscs;

import java.util.Scanner;

public class Personalien
{
    public static void maibn(String[] args)
    {   
        String name = new String();
        String telefonnummer = new String(); 
        Scanner scan = new Scanner(System.in);
        System.out.println("---Personalien----\n");
        System.out.println("Geben sie ihren Namen ein:");
        name = scan.next();
        System.out.println("Geben sie ihre Nummer ein:");
        telefonnummer = scan.next();
        System.out.println("Name: " + name +"\n");
        System.out.println("Nummer:: " + telefonnummer);
    }
}
