package Bruch.src;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int nenner;
        int zaehler;
        int gemischteZahl;
        double ergebnis;
        int eingabe;
        int schleifenzaehler=0;
        Bruch bruch = new Bruch(0,0,0,0);
        Bruch bruch2 = new Bruch(0,0,0,0);


        //Bruch erstellen
        System.out.println("Welche Berechnung soll durchgeführt werden?");
        System.out.println("\n 1. Addition");
        System.out.println("\n 2. Subtraktion");
        System.out.println("\n 3. Multiplikation");
        System.out.println("\n 4. Division");
        eingabe=scanner.nextInt();
        if(eingabe>4 || eingabe<0)
        {
            System.out.println("Fehler!");
            return;
        }
        while (schleifenzaehler < 2)
        {
            System.out.println("***Geben sie die Werte für den Bruch ein***");
            System.out.print("\n Gemischte Zahl: ");
            gemischteZahl = scanner.nextInt();
            System.out.print("\n Nenner: ");
            nenner = scanner.nextInt();
            System.out.print("\n Zähler: ");
            zaehler = scanner.nextInt();

            if (schleifenzaehler == 0) {
                // 1. Durchlauf -> ersten Bruch setzen
                erstelleBruch(bruch, gemischteZahl, nenner, zaehler);
            } else {
                // 2. Durchlauf -> zweiten Bruch setzen und dann addieren

                erstelleBruch2(bruch2, gemischteZahl, nenner, zaehler);
                switch (eingabe) {
                    case 1:
                        addieren(bruch, bruch2);
                        break;

                    case 2:
                        subtraktion(bruch, bruch2);
                        break;

                    case 3:
                        multiplication(bruch, bruch2);
                        break;

                    case 4:
                        division(bruch, bruch2);
                        break;
                }
            }

            schleifenzaehler++;
        }
    }


    public static void erstelleBruch(Bruch bruch,int gemischteZahl, int nenner, int zaehler)
    {


        bruch.setSummand(gemischteZahl);
        bruch.setZaehler(zaehler);
        bruch.setNenner(nenner);

    }

    public static void erstelleBruch2(Bruch bruch2,int gemischteZahl, int nenner, int zaehler)
    {

        bruch2.setSummand(gemischteZahl);
        bruch2.setZaehler(zaehler);
        bruch2.setNenner(nenner);

    }



    public static void addieren(Bruch bruch,Bruch bruch2)
    {

        long z1 = (long)bruch.summand * bruch.nenner + bruch.zaehler;
        long n1 = bruch.nenner;
        long z2 = (long)bruch2.summand * bruch2.nenner + bruch2.zaehler;
        long n2 = bruch2.nenner;

        double ergebnis = (double)(z1 * n2 + z2 * n1) / (double)(n1 * n2);
        System.out.println("\nDezimal (Summe): " + ergebnis);

    }


    public static void subtraktion(Bruch bruch,Bruch bruch2)
    {
        long z1 = (long)bruch.summand * bruch.nenner + bruch.zaehler;
        long n1 = bruch.nenner;
        long z2 = (long)bruch2.summand * bruch2.nenner + bruch2.zaehler;
        long n2 = bruch2.nenner;

        double ergebnis = (double)(z1 * n2 - z2 * n1) / (double)(n1 * n2);
        System.out.println("\nDezimal (Summe): " + ergebnis);
    }


    public static void multiplication(Bruch bruch,Bruch bruch2)
    {
        long z1 = (long)bruch.summand * bruch.nenner + bruch.zaehler;
        long n1 = bruch.nenner;
        long z2 = (long)bruch2.summand * bruch2.nenner + bruch2.zaehler;
        long n2 = bruch2.nenner;

        double ergebnis =  ((double)z1 / n1) * ((double)z2 / n2);
        System.out.println("\nDezimal (Summe): " + ergebnis);
    }


    public static void division(Bruch bruch,Bruch bruch2)
    {
        long z1 = (long)bruch.summand * bruch.nenner + bruch.zaehler;
        long n1 = bruch.nenner;
        long z2 = (long)bruch2.summand * bruch2.nenner + bruch2.zaehler;
        long n2 = bruch2.nenner;
        double bruch2KehrWert=kehrWerte(bruch2);
        double ergebnis =  ((double)z1 / n1) * ((double)bruch2KehrWert);
        System.out.println("\nDezimal (Summe): " + ergebnis);
    }


    public static double kehrWerte(Bruch bruch2)
    {

        long z2 = (long)bruch2.summand * bruch2.nenner + bruch2.zaehler;
        long n2 = bruch2.nenner;

       double kehrwert=(double)n2 / z2;
       return kehrwert;
    }
}
